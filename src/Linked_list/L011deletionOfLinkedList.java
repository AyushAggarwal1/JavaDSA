package Linked_list;

public class L011deletionOfLinkedList
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

    public Node deleteNode(Node head, int x)
    {
        int count = 1;

        if(x == 1)
        {
            head = head.next;
            return head;
        }

        Node current = head;
        Node prev = head;

        while(count != x)
        {
            prev = current;
            current = current.next;
            count ++;
        }

        prev.next = current.next;

        return head;
    }

    public void printLinkedList()
    {
        if(head == null)
        {
            System.out.println("Empty Linked List");
        }

        else
        {
            Node current = head;

            while(current != null)
            {
                System.out.println(current.data + " -> ");
                current = current.next;
            }
        }
    }

    public void addNode(int arg)
    {
        Node newN = new Node(arg);

        if(head == null)
        {
            head = newN;
            return;
        }

        else
        {
            Node current = head;

            while(current.next != null)
            {
                current = current.next;
            }

            current.next = newN;
        }
    }

    public static void main(String args[])
    {
        L011deletionOfLinkedList ll = new L011deletionOfLinkedList();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);

        ll.deleteNode(ll.head, 3);

        ll.printLinkedList();
    }
}