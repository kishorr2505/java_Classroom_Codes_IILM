class Solution {
    public void swap(int[]nums, int idx, int smaller){
        int temp = nums[idx];
        nums[idx] = nums[smaller];
        nums[smaller] = temp;
    }

    public static void reverse(int[] nums, int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx = nums.length-1;
        int smaller = Integer.MAX_VALUE;
        int smallerIdx=0;
        while(idx>0){
            if(nums[idx-1]<nums[idx]){
                break;
            }
            idx--;
        }
        idx--;

        if(idx==-1){
            Arrays.sort(nums);
            return;
        }else{
            
            for(int i=idx+1;i<nums.length;i++){
                if(nums[i] > nums[idx])
                {
                    if(smaller > nums[i]){
                        smaller = nums[i];
                        smallerIdx = i;
                    }
                }
            }
        }

        swap(nums, idx, smallerIdx);
        reverse(nums, idx+1, nums.length-1);
       
    }
}