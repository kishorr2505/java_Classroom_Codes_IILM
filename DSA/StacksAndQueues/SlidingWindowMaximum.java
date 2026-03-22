// https://leetcode.com/problems/sliding-window-maximum/description/
// Q.239 - Sliding window Maximum

// Time = O(n) , Space = O(n)
class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int n = nums.length;
        int []result = new int[n-k+1];
       
        for(int i=0;i<n;i++){
            if(i>=k){
                result[i-k] =  nums[q.peekFirst()];
                if(i - q.peekFirst()>=k) q.removeFirst(); 
            }
            while(!q.isEmpty()&& nums[q.peekLast()]<= nums[i]){
                q.removeLast();
            }
            
            
            q.offer(i);
        }
        result[n-k] = nums[q.peekFirst()];
        return result;

    }
}