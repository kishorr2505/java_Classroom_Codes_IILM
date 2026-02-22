public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newNode = new ListNode();
        ListNode pre = newNode;
        ListNode curr  = head;

        while(curr != null){

            if(curr.next == null || curr.val != curr.next.val){
                pre.next = curr;
                pre = curr;
                curr = curr.next;
            }else{
                ListNode nextNode = curr.next;
                while(nextNode != null && nextNode.val == curr.val){
                    nextNode = nextNode.next;
                }

                curr = nextNode;
            }
           

        }
         pre.next = curr;
         return newNode.next;
        
    }