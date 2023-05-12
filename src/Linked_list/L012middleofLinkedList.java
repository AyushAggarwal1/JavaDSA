package Linked_list;

public class L012middleofLinkedList
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

    public int middleData1(Node head) // less efficient
    {
        int count = 1;

        Node current = head;

        while(current.next != null)
        {
            count ++;
            current = current.next;
        }

        current = head;

        int mid = count/2;

        while(mid != 0)
        {
            mid -- ;
            current = current.next;
        }

        return current.data;
    }

    public int middleData2(Node head) // more efficient
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}
