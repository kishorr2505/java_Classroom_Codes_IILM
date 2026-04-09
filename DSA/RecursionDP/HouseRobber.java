// Leetcode question 198 
// https://leetcode.com/problems/house-robber/

// dp + iterative approach

class Solution {
    public int rob(int[] nums) {
        if(nums.length ==0) return 0;
        if(nums.length ==1) return nums[0];
        if(nums.length ==2) return Math.max(nums[0],nums[1]);
        
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            int currProfit = Math.max(nums[i]+prev2, prev1);
            prev2 = prev1;
            prev1 = currProfit;
        }
    return prev1;
    }
}

// dp + recursive approach

class Solution {
    
    public int rob(int[] nums) {
        int dp [] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            dp[i] = -1;
        }

        return maxAmount(dp,0,nums);
    }

    public static int maxAmount(int [] dp, int i, int [] nums){
        if(i>=nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int robI = nums[i] + maxAmount(dp, i+2, nums);
        int skipI = maxAmount(dp, i+1,nums);
        dp[i] =  Math.max(robI,skipI); 
        return dp[i];
    }
}