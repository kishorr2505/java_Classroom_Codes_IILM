// Leetcode question No : 978
// link = https://leetcode.com/problems/longest-turbulent-subarray/description/
class ZigZagArray{
    public static int zigZagLength(int arr[]){
        int n = arr.length;
        int maxLen = 1;
        int currLen = 1;
        boolean isLarge  = true;
        for(int i=0;i<n-1;i++){
            if(isLarge) {
                if(arr[i]<arr[i+1]){
                    currLen++;
                    isLarge = false;
                }else{
                    if(arr[i]>arr[i+1]) currLen = 2;
                    else currLen = 1;
                    isLarge = true;
                }
            }else{
                if(arr[i]>arr[i+1]){
                    currLen++;
                    isLarge = true;
                }else{
                    if(arr[i]<arr[i+1]) currLen = 2;
                    else currLen = 1;
                    isLarge = false;
                }
            }

            maxLen = Math.max(maxLen, currLen);
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
       int longestLength =  zigZagLength(new int[]{1,2,3,1,4,3,10,5,4});
        System.out.println(longestLength);
        
    }
}
