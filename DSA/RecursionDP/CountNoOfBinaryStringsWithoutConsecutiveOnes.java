//  using dp+ recursion
class Solution {
    int [] arr = new int[45];
    int countStrings(int n) {
        // code here
        if(n==0) return 1;
        if(n ==1) return 2;
        if(arr[n] != 0) return arr[n];
        arr[n] = countStrings(n-1) + countStrings(n-2);
        return arr[n];
    }
}