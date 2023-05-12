package Linked_list;

import java.util.*;

public class L018MergeKthSorted
{
    
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class NodeComparator implements Comparator<ListNode> {
 
    public int compare(ListNode k1, ListNode k2)
    {
        if (k1.val > k2.val)
            return 1;
        else if (k1.val < k2.val)
            return -1;
        return 0;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new NodeComparator());
        
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        
        for(int i=0; i<lists.length; i++)
        {
            if(lists[i] != null)
            {
                pq.add(lists[i]);
            }
        }
        
        while(pq.size() != 0)
        {
            ListNode temp = pq.peek();
            tail.next = temp;
            tail = tail.next;
            
            pq.poll();
            
            if(temp.next != null)
            {
                pq.add(temp.next);
            }
        }
        
        return dummy.next;
    }
}