import java.util.*;
// using recursion , Time = O(3^n) , Space = O(n)
public class Main {
    public static int maxCuts(int n, int a, int b, int c) {
        if (n == 0) return 0;
        if (n < 0) return -1;

        // Compare two at a time
        int resA = maxCuts(n - a, a, b, c);
        int resB = maxCuts(n - b, a, b, c);
        int resC = maxCuts(n - c, a, b, c);

        // Nested Math.max to find the largest of three
        int result = Math.max(resA, Math.max(resB, resC));

        if (result == -1) return -1;

        return result + 1;
    }

    public static void main(String[] args) {
        // Output for (17, 10, 11, 3) should be 3 (11 + 3 + 3)
        System.out.println(maxCuts(17, 10, 11, 3));
    }
}

// Using recursion + dp 
// time O(n) space O(n)
public class Main
{
    public static int maxCuts(int n , int a,int b, int c){
       int [] dp = new int[n+1];
       
       for(int i=0;i<=n;i++){
           dp[i] = -10;
       }
       
       return cutRope(n,a,b,c,dp);
    }
    
    public static int cutRope(int n, int a, int b, int c, int []dp){
        if(n==0) return 0;
        if(n<0) return -1;
        
        if(dp[n] != -10) return dp[n];
        
        int result = Math.max(cutRope(n-a,a,b,c,dp), cutRope(n-b,a,b,c,dp));
        result = Math.max(result, cutRope(n-c,a,b,c,dp));
        
       
        if(result == -1)  dp[n] = -1;
        else dp[n] = result+1;
        
        return dp[n];
    }
	public static void main(String[] args) {
		System.out.println(maxCuts(17,10,11,3));
	}
}