package Linked_list;

public class L019RemoveDuplicatesSorted {

    //recursive
    public ListNode deleteDuplicates(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode newHead = deleteDuplicates(head.next);

        if(head.val == newHead.val)
        {
            return newHead;
        }

        else
        {
            head.next = newHead;
            return head;
        }
    }

    //ilterative
    public ListNode deleteDuplicates2(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode temp = head;

        while(temp.next != null)
        {
            if(temp.val == temp.next.val)
            {
                temp.next = temp.next.next;
            }

            else
            {
                temp = temp.next;
            }
        }

        return head;

    }
}

