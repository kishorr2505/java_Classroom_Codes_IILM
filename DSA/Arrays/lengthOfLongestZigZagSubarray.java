class Solution{
    // Optimized
    public int zigZagLength(int arr[]){
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
    // brute force
    // public int zigZagLength(int arr[]){
    //     int n = arr.length;
    //     int maxLen = 1;

    //     for(int i=0;i<n-1;i++){
    //         int currVal = 0;
    //         int preVal = 0;
    //         int currLen= 1;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[j]-arr[j-1]>0) currVal = 1;
    //             else if(arr[j]-arr[j-1]<0) currVal = -1;
    //             else break;

    //             if(preVal ==0){
    //                 currLen ++;
    //                 preVal = currVal;
    //             }else if(currVal != preVal){
    //                 currLen ++;
    //                 preVal = currVal;
    //             }else break;
    //         }

    //         maxLen = Math.max(maxLen, currLen);
    //     }

    //     return maxLen;
    // }
}

class ZigZagArray{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.zigZagLength(new int[]{1,1,2,0,5,6,6,3,4,1}));
        
    }
}

//{1,1,2,0,5,6,6,3,4,1}