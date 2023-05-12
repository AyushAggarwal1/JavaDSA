package Linked_list;

public class L024RemoveElement{

    // ilterative
    
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = dummy;
        
        while(tail != null && tail.next != null)
        {
            if(tail.next.val == val)
            {
                tail.next = tail.next.next;
            }
            else
            {
                tail = tail.next;
            }
        }
        
        return dummy.next;
    }


    //recursive

    public ListNode removeElements2(ListNode head, int val) {
        if(head == null)
        {
            return null;
        }
        
        head.next = removeElements(head.next,val);
        
        if(head.val == val)
        {
            return head.next;
        }
        
        else
        {
            return head;    
        }
    }
}