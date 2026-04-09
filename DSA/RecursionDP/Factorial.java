class Solution {
    public int fib(int n) {
       int first = 0;
       int second = 1;
       int newTerm=1;
       if(n==0) return first;
       if(n==1)return second;
       for(int i=2;i<=n;i++){
           newTerm = first + second;
           first = second;
           second = newTerm; 
       }

       return newTerm;
    }
}