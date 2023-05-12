package Linked_list;

public class L023PalindromeLL {
    public ListNode reverse(ListNode temp)
    {
        ListNode prev = null;
        ListNode curr = temp;
        ListNode nex = null;

        while(curr != null)
        {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);

        ListNode start = head;
        ListNode mid = slow.next;

        while(mid != null)
        {
            if(start.val != mid.val)
            {
                return true;
            }

            start = start.next;
            mid = mid.next;
        }

        return true;
    }
}
