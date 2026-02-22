// by using O(n) space less optimized
public ListNode detectCycle(ListNode head) {
        Set<ListNode>set = new HashSet<>();
        ListNode curr = head;
        while(curr != null){
            if(set.contains(curr)) {
               return curr; 
            }

            set.add(curr);
            curr = curr.next;
        }
    return null;
    }

// without using space, more optimized

 public ListNode detectCycle(ListNode head) {
        if(head ==null) return head;
        ListNode fast = head;
        ListNode slow = head;
        boolean isCycle = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

             if(fast == slow) {
                isCycle = true;
                break;
            }
        }

        
        if(isCycle){
            slow = head;
            while(fast != null && fast.next != null){
            if(fast==slow) return fast;

            fast = fast.next;
            slow = slow.next;
        }
        }
        return null;
    }