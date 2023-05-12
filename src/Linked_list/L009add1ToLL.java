package Linked_list;

public class L009add1ToLL
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
        Node newl = new Node(data);

        if(head == null)
        {
            head = newl;
            return;
        }

        Node currentNode = head;

        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = newl;
    }

    public void printLL()
    {
        if(head == null)
        {
            System.out.println("linked list is empty");
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

    public Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;

        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }


    public Node add1(Node head)
    {
        head = reverse(head);

        Node current = head;

        int carry = 0;
        while(current != null)
        {
            int sum = 0;
            sum = current.data + 1;


            if(sum >= 10)
            {
                current.data = sum % 10;
            }

            else
            {
                current.data = sum;
            }

            carry = sum / 10;

            if(carry != 0)
            {
                current = current.next;
            }

            else
            {
                break;
            }
        }

        head = reverse(head);

        if(head.data == 0 && carry != 0)
        {
            Node temp = new Node(carry);
            temp.next = head;
            head = temp;
        }

        return head;

    }

        public static void main(String[] args)
        {
            L009add1ToLL newll = new L009add1ToLL();
            // newll.addFirst(0);
            // newll.addLast(2);
            // newll.addLast(3);
            // newll.addLast(4);
            // newll.addLast(5);
            newll.addLast(8);
            newll.addLast(9);
            newll.addLast(9);
            newll.addLast(9);
            newll.addLast(9);
            newll.addLast(9);
            newll.addLast(9);

            System.out.println("original linked list");
            newll.printLL();

            System.out.println("after added 1");
            newll.head = newll.add1(newll.head);

            newll.printLL();
        }
}
