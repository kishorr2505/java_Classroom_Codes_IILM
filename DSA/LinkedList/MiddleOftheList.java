// using iterative approach 
// Question leetcode 876
// Link -> https://leetcode.com/problems/middle-of-the-linked-list/description/
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next !=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
    return slow;
    }
}


// using recursion 

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
         ListNode middle = findMiddle(slow, fast);
         return middle;
    }

    public ListNode findMiddle(ListNode slow, ListNode fast){
        if(fast == null || fast.next == null) return slow;

        return findMiddle(slow.next, fast.next.next);
        
    }
}