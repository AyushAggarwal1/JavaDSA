package Linked_list;

public class L013binarytoDecimal
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

    //  1. reverse linked list then multiple by 2 pow 0 to null
    //  2. find lenght of ll then multiply 2^length to 0
    //  3. multiple answer = 0 with 2 and then add current node data

    public int BinToDec(Node head)
    {
        Node current = head;

        int answer = 0;

        while(current != null)
        {
            answer = answer*2 + current.data;
            current = current.next;
        }
        return answer;
    }
}