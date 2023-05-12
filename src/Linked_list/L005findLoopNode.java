package Linked_list;

public class L005findLoopNode
{
    Node head;

    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currentNode = head;

        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void printLinkedList()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;

        while(currNode.next != null)
        {
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public Node findLoopNodeLinkedList(Node head)
    {
        if(head == null)
        {
            return null;
        }

        Node fast = head;
        Node slow = head;

        Node entry = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                while(slow != entry)
                {
                    entry = entry.next;
                    slow = slow.next;
                }

                return slow;
            }
        }

        return null;
    }

    public static void main(String[] args)
    {
        L005findLoopNode newLinkedList = new L005findLoopNode();

        newLinkedList.addFirst("50");
        newLinkedList.addLast("20");
        newLinkedList.addLast("15");
        newLinkedList.addLast("4");
        newLinkedList.addLast("10");

        // creating linked list loop
        newLinkedList.head.next.next.next.next = newLinkedList.head.next;

        Node var = newLinkedList.findLoopNodeLinkedList(newLinkedList.head);


        if(var == null)
        {
            System.out.println("no loop found");
        }

        else
        {
            System.out.println("loop found");
            System.out.println(var.data);
        }
    }
}
