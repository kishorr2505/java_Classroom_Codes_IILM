//https://leetcode.com/problems/linked-list-cycle/
// leetcode Question 141

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null  && fast.next != null  ){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow) return true;

        }
    return false;
    }
}