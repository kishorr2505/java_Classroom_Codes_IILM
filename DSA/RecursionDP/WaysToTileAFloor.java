// using dp => optimized approach, 
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

// using recursion => exponential time (2^n)

class Solution {
    public int numberOfWays(int n) {
        // code here
        if(n<=1) return 1;
        
        arr[n] =  numberOfWays(n-1) + numberOfWays(n-2);
        return arr[n];
        
    }
};
