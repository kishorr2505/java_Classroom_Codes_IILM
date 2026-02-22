public class MergeKsortedLists {
    
}public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>que = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(ListNode node: lists){
            if(node != null){
                que.add(node);
            }
        }

        ListNode temp = new ListNode();
        ListNode res = temp;
        while(!que.isEmpty()){
            ListNode curr = que.poll();
            res.next = curr;
            res = res.next;

            if(curr.next != null){
                que.offer(curr.next);
            }
        }

        return temp.next;
    }
