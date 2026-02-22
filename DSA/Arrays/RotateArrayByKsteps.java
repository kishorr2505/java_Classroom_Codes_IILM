// brute force approach
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        for(int i=0;i<k;i++){
            int lastElement = nums[n-1];
            for(int j=n-1;j>0;j--){
                nums[j] = nums[j-1];
            }
            nums[0] = lastElement;
        }
    
    }
}

// time = O(n) , space = O(n)
class Solution {
    public void rotate(int[] nums, int k) {
         k=k%nums.length;
         int[] temp=new int[nums.length]; 

        for(int i=0;i<nums.length;i++)
        {
          temp[(i+k)%nums.length]=nums[i];
        }

         for(int i=0;i<nums.length;i++)
         {
            nums[i]=temp[i];
         }
    }
}


//////////
/// 
/// k = k%nums.length;
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);    

    }
    public void reverseArray(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }