// Leetcode qeution 279 = Perfect squares
// https://leetcode.com/problems/perfect-squares/description/

// time O(root n^n) , space O(n)
class Solution {
    public int numSquares(int n) {
        if(n==0) return 0;
        int minVal = Integer.MAX_VALUE;
        for(int i=1;i*i <= n;i++){
           int  res = 1 + numSquares(n- (i*i));

            if(res != -1){
                minVal = Math.min(minVal, res);
            }
        }

        return minVal;
    }
}

// optimized dp+ recursive
// Time O(n* root n) space O(n)
class Solution {

    public static int numSquares(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(dp, n);
    }

    public static int helper(int []dp, int n){
        if(n==0) return 0;
        int minVal = Integer.MAX_VALUE;
        if(dp[n]!= -1) return dp[n];
        for(int i=1;i*i <= n;i++){
           int  res = 1 + helper(dp, n- (i*i));

            if(res != -1){
                minVal = Math.min(minVal, res);
            }
        }
        dp[n] = minVal;
        return dp[n];
    }
}

// using tabulation 
// same time and space but more faster

class Solution {

    public static int numSquares(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        return helper(dp, n);
    }

    public static int helper(int []dp, int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j*j<=i;j++){
                dp[i] = Math.min(dp[i],1+dp[i-j*j]);
            }
        }
        return dp[n];
    }
}