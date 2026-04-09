// leetcode question 322 - Coin Change
// https://leetcode.com/problems/coin-change/description/ 

// time = O(n^amount), O(amount) , n = no of coins

import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        if(amount <0) return -1;
        int minVal = Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++){
            int result = coinChange(coins, amount- coins[i]);
            if(result != -1){
                minVal = Math.min(minVal, result+1);
            }
        }
        return minVal == Integer.MAX_VALUE ? -1 : minVal;
    }
}


// Dp + recursion

// time = O(amount * coins) --> for each amount we loop over all the coins
// Space O(amount)
class Solution {
    public int coinChange(int[] coins, int amount) {
        int [] dp = new int [amount+1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        return calculate(dp, coins, amount);
    }

    public static int calculate(int [] dp, int []coins, int amount){
        if(amount==0) return 0;
        if(amount <0) return -1;

        if(dp[amount]!= Integer.MIN_VALUE) return dp[amount];
        
        int minVal = Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++){
           int result = calculate(dp, coins, amount-coins[i]);

           if(result != -1){
                minVal = Math.min(minVal, result+1);
           }
        }
        if(minVal != Integer.MAX_VALUE) {
            dp[amount] = minVal;
            
        }else{
            dp[amount] = -1;
        }
        
        return dp[amount];
    }
}

// more optimized using dp+ iterative approach
// time = O(amount * coins) --> for each amount we loop over all the coins
// Space O(amount)
// here only the space for dp array , no space is used for recursion stack
public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    
    Arrays.fill(dp, amount + 1); // large value
    dp[0] = 0;

    for (int i = 1; i <= amount; i++) {
        for (int coin : coins) {
            if (i - coin >= 0) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
    }

    return dp[amount] == amount + 1 ? -1 : dp[amount];
}