class Solution {

    
    public int climbStairs(int n) {
        
        if(n==1) return 1;
        if(n==2) return 2;

        int fst = 1;
        int snd = 2;
        
        for(int i=3;i<=n;i++){
            int curr = fst+snd;
             
            fst = snd;
             snd = curr;

        }
       return snd; 
    }
}

// less optimized 
 public int climbStairs(int n) {
        
        if(n==1) return 1;
        if(n==2) return 2;

        return climbStairs(n-1)+climbStairs(n-2);
    }

// using recursion less optimized => Time Complexity: O(2^n), space: O(n)
class Solution {

    
    public int climbStairs(int n) {
        return climb(0,n);
    }

    public int climb(int i, int n){
        if(i==n) return 1;
        if(i>n) return 0;

        return climb(i+1,n) + climb(i+2,n);
    }
}
// Optimized using dp
class Solution {
    int [] arr = new int[46];
    public int numberOfWays(int n) {
        // code here
        if(n<=1) return 1;
        
        if(arr[n] != 0) return arr[n];
        arr[n] =  numberOfWays(n-1) + numberOfWays(n-2);
        return arr[n];
        
    }
};