package Linked_list;

public class L007removeDuplicatesInUnsortedLL
{
    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data)
    {
        Node current = new Node(data);

        if(head == null)
        {
            head = current;
            return;
        }

        current.next = head;
        head = current;
    }

    public void addLast(int data)
    {
        Node newLL = new Node(data);

        if(head == null)
        {
            head = newLL;
            return;
        }

        Node current = head;

        while(current.next != null)
        {
            current = current.next;
        }

        current.next = newLL;
    }

    public void printLL()
    {
        if(head == null)
        {
            System.out.println("LL is empty");
            return;
        }

        Node newLL = head;

        while(newLL != null)
        {
            System.out.print(newLL.data + " -> ");
            newLL = newLL.next;
        }

        System.out.println("null");
    }

    public void removeDup()
    {
        if(head == null)
        {
            return;
        }

        Node current = head;
        while(current != null)
        {
            Node temp = current;

            while(temp.next != null)
            {
                if(current.data == temp.next.data)
                {
                    current.next = current.next.next;
                }
                else
                {
                    temp = temp.next;
                }
            }
            current = current.next;
        }
    }

    public static void main(String[] args)
    {
        L007removeDuplicatesInUnsortedLL linked = new L007removeDuplicatesInUnsortedLL();
        linked.addLast(4);
        linked.addLast(4);
        linked.addLast(4);
        linked.addLast(4);
        linked.addLast(4);
        linked.addLast(4);
        linked.addLast(4);
        linked.addLast(4);
        linked.addLast(4);

        System.out.println("original ll");
        linked.printLL();

        linked.removeDup();

        System.out.println("ll after remove duplicat in unsorted ll");
        linked.printLL();
    }
}
