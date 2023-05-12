package Linked_list;

public class L008makeLastToFirst
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
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node current = head ;

        while(current.next != null)
        {
            current = current.next;
        }

        current.next = newNode;
    }

    public void printl()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }

        Node current = head;

        while(current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public void makelasttofir()
    {
        Node last = head.next;
        Node seclast = head;

        while(last.next != null)
        {
            last = last.next;
            seclast = seclast.next;
        }

        seclast.next = null;
        last.next = head;
        head = last;
    }

    public static void main(String[] args)
    {
        L008makeLastToFirst newll = new L008makeLastToFirst();
        newll.addFirst(1);
        newll.addLast(2);
        newll.addLast(3);
        newll.addLast(4);
        newll.addLast(5);
        newll.addLast(6);

        System.out.println("original linked list");
        newll.printl();

        System.out.println("after last to first");
        newll.makelasttofir();
        newll.printl();
    }
}
