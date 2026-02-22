
// Leetcode question No : 978
// link = https://leetcode.com/problems/longest-turbulent-subarray/description/

class ZigZagArray{
    public static int zigZagLength(int arr[]){
        int n = arr.length;
        int maxLen = 1;

        for(int i=0;i<n-1;i++){
            int currVal = 0;
            int preVal = 0;
            int currLen= 1;
            for(int j=i+1;j<n;j++){
                if(arr[j]-arr[j-1]>0) currVal = 1;
                else if(arr[j]-arr[j-1]<0) currVal = -1;
                else break;

                if(preVal ==0){
                    currLen ++;
                    preVal = currVal;
                }else if(currVal != preVal){
                    currLen ++;
                    preVal = currVal;
                }else break;
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
