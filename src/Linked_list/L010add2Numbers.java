package Linked_list;

public class L010add2Numbers
{
    Node head ;

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
        Node newN = new Node(data);

        if(head == null)
        {
            head = newN;
            return;
        }

        newN.next = head;
        head = newN;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next != null)
        {
            current = current.next;
        }

        current.next = newNode;
    }
}
