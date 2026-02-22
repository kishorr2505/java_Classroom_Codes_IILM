// Merged Two sorted list leetcode question 21
// link -> https://leetcode.com/problems/merge-two-sorted-lists/submissions/1920253585/

//   Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedHead = new ListNode();
        ListNode currNode = mergedHead;

        while(list1 != null && list2 != null ){
                if(list1.val >= list2.val){
                    currNode.next = list2;
                    list2 = list2.next;

                }else{
                    currNode.next = list1;
                    list1 = list1.next;
                }
                currNode = currNode.next;
        }

        if(list1==null) currNode.next= list2;
        else currNode.next = list1;

        return mergedHead.next;
    }
}