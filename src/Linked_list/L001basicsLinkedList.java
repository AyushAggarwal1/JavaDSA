package Linked_list;

class L001basicsLinkedList
{

    Node head;
    private int size;

    L001basicsLinkedList()
    {
        this.size = 0;
    }

    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size ++ ;
        }
    }


    //  add => add first, add last

    // add first
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

    // add Last
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

    // delete => first, last

    // delete first
    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }

        size -- ;

        head = head.next;
    }

    // delete last
    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }

        size -- ;

        if(head.next == null)
        {
            head = null;
            return;
        }

        Node secLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secLast = secLast.next;
        }

        secLast.next = null;
    }

    public void deleteEnd()
    {
        if(head == null)
        {
            return ;
        }

        if(head.next == null)
        {
            return ;
        }

        size--;

        Node secLast = head;

        while(secLast.next.next != null)
        {
            secLast = secLast.next;
        }

        secLast.next = null;
    }

    // print linked List
    public void printLL()
    {
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;

        while(currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NUll");
    }

    // size of linked list
    public int sizeLinkedList()
    {
        return size;
    }

    public static void main(String[] args)
    {
        L001basicsLinkedList ll = new L001basicsLinkedList();

        ll.addFirst("a");
        ll.addFirst("is");

        ll.printLL();

        ll.addFirst("this");
        ll.addLast("list");
        ll.printLL();

        ll.deleteFirst();
        ll.printLL();

        ll.deleteEnd();
        ll.printLL();

        System.out.println(ll.sizeLinkedList());
    }
}
