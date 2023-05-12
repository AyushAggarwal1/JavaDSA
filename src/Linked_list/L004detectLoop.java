package Linked_list;

public class L004detectLoop
{
    Node head;

    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            next = null;
        }
    }

    public void addFirst(String data)
    {
        Node current = new Node(data);

        if(head == null)
        {
            head = current;
            return;
        }

        current.next =  head;
        head = current;
    }

    public void addLast(String data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;

        while(currNode.next != null)
        {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printLinkedList()
    {
        Node curr = head;

        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }

        while(curr != null)
        {
            System.out.print(curr.data +" -> ");
            curr = curr.next;
        }
    }

    public boolean detect(Node head)
    {
        if(head == null)
        {
            return false;
        }

        Node low = head;
        Node high = head;

        while(high != null && high.next != null)
        {
            if(low == high)
            {
                return true;
            }

            low =  low.next;
            high = high.next.next;
        }

        return false;
    }
    public static void main(String[] args)
    {
        L004detectLoop LinkedL = new L004detectLoop();

        LinkedL.addFirst("1");
        LinkedL.addLast("2");
        LinkedL.addLast("1");
        LinkedL.addLast("4");
        LinkedL.addLast("5");

        // creating linked list loop

        //LinkedL.head.next= LinkedL.head; //returns true

        boolean var = LinkedL.detect(LinkedL.head);

        System.out.println(var);
    }
}