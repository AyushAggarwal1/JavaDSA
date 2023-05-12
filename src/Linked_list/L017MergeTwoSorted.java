package Linked_list;

public class L017MergeTwoSorted
{
    ListNode head;

    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {

        ListNode ans = new ListNode(0);

        if(list1 == null)
        {
            return list2;
        }

        if(list2 == null)
        {
            return list1;
        }

        while(list1 != null && list2 != null)
        {
            if(list1.val < list2.val)
            {
                ans.next = list1;
                list1 = list1.next;
            }

            else if(list2.val < list1.val)
            {
                ans.next = list2;
                list2 = list2.next;
            }
        }

        if(list1 == null)
        {
            ans.next = list2;
        }

        if(list2 == null)
        {
            ans.next = list1;
        }
        return ans.next;
    }

    public void addLast(int data)
    {
        ListNode newl = new ListNode(data);

        if(head == null)
        {
            head = newl;
            return;
        }

        ListNode currentNode = head;

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

        ListNode current = head;

        while(current != null)
        {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
