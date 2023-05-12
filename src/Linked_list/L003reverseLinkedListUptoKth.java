package Linked_list;

public class L003reverseLinkedListUptoKth 
{
    Node head;
    
    class Node
    {
        
        String data;
        Node next;

        Node(String data)
        {   
            this.data = data;
            this.next = null;
        }
    }
    
    public void addFirst(String data)
    {
        Node node = new Node(data);
        
        if(head == null)
        {
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public void addLast(String data)
    {
        Node newN = new Node(data);

        if(head == null)
        {
            newN = head;
            return;
        }

        Node currNode = head;

        while(currNode.next != null)
        {
            currNode = currNode.next;
        }

        currNode.next = newN;
    }

    public Node reverseLL(Node head, int k)     
    {
        Node dummy = new Node("0"); 
        dummy.next = head;
        
        Node prev = dummy;
        Node current = dummy;
        Node next = dummy;
        
        int count = 0;
        
        while(current.next != null)
        {
            count = count + 1;
            current = current.next;
            
        }
        while(count >= k )
        {
            current = prev.next;
            next = current.next;
            
            for(int i=1; i<k; i++)
            {
                current.next = next.next;
                next.next = prev.next;

                prev.next = next;
                next = current.next;
            }
            
            prev = current;
            count = count-k;
        }
        
        
        return dummy.next;
    }

    public void printLL()
    {
        Node curr = head;

        if(head == null)
        {
            System.out.print("empty list");
            return;
        }

        while(curr != null)
        {
            System.out.println(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) 
    {
        L003reverseLinkedListUptoKth linkedLis = new L003reverseLinkedListUptoKth();
        linkedLis.addFirst("1");
        linkedLis.addLast("2");
        linkedLis.addLast("3");
        linkedLis.addLast("4");
        linkedLis.addLast("5");
        
        int k = 3;

        linkedLis.printLL();
        linkedLis.head = linkedLis.reverseLL(linkedLis.head, k);
        linkedLis.printLL();

    }
}
