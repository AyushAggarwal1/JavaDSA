package Linked_list;

public class L006removeDuplicatesInSortedLL
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
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currentNode =  head;

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
            System.out.println("ll is empty");
        }

        Node newNode = head;

        while(newNode != null)
        {
            System.out.print(newNode.data + " -> ");

            newNode = newNode.next;
        }
        System.out.println("NUll");
    }

    public Node removeDuplicated(Node head)
    {
        if(head == null)
        {
            return null;
        }

        Node current = head;

        while(current.next != null)
        {
            if(current.data == current.next.data)
            {
                current.next = current.next.next;
            }

            else
            {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args)
    {
        L006removeDuplicatesInSortedLL ll = new L006removeDuplicatesInSortedLL();

        ll.addFirst(30);
        ll.addLast(30);
        ll.addLast(30);
        ll.addLast(30);
        ll.addLast(30);

        ll.printLinkedList();

        ll.head = ll.removeDuplicated(ll.head);

        ll.printLinkedList();
    }
}
