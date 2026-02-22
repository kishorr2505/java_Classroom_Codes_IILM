// leetcode question 160 
//https://leetcode.com/problems/intersection-of-two-linked-lists/description/

public class intersectionOfTwoLists {
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;

        while(currA != currB){
            if(currA !=null) currA = currA.next;
            else currA = headB;

            if(currB != null) currB = currB.next;
            else currB = headA;
        }
        return currA;
    }   
}

// By calculating the difference of length
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int l1=0, l2=0;
        ListNode currA = headA;
        ListNode currB = headB;
       while(currA != null || currB != null){
            if(currA != null) {
                l1++;
                currA = currA.next;
            }
            if(currB != null){
                 l2++;
                currB = currB.next;
            }


       }

       int diff = Math.abs(l1-l2);
        currA = headA;
        currB = headB;
       if(l1>l2){
             while(diff>0){
                currA = currA.next;
                diff--;
             }
       }else{
            while(diff>0){
                currB = currB.next;
                diff--;
            }
       }

       while(currA !=null && currB != null){
            if(currA ==currB) return currA;
            
            currA = currA.next;
            currB = currB.next;
       }
       
    return null;

    }
