package Linked_list;

class L002reverseLinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // addFirst to linked List
    public void addFirst(String data) {
        Node newN = new Node(data);

        if (head == null) {
            head = newN;
            return;
        }

        newN.next = head;
        head = newN;
    }

    // addLast to linked list
    public void addlast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // reverse linkedList using Iterative method
    public void reverseIterative() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // reverse linked list using recurssion method
    public Node reverseRecurssion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecurssion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // print Linked List
    public void printLinkedList() {

        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        L002reverseLinkedList list = new L002reverseLinkedList();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addlast("list");

        System.out.println("original linked list");
        list.printLinkedList();

        System.out.println("reverse using iterative method");
        list.reverseIterative();
        list.printLinkedList();

        System.out.println("reverse using recurssion method");
        list.head = list.reverseRecurssion(list.head);
        list.printLinkedList();
    }
}
