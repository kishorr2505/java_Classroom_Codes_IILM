class Solution {
    public boolean check(int[] nums) {
        boolean flag = false;
        if(nums.length==1)return true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1] && flag==true) return false;
            else if(nums[i]< nums[i-1]) flag = true;
        }

        return flag==false || nums[nums.length-1]<= nums[0];
    }
}