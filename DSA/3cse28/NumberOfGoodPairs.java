class Solution {
    public int numIdenticalPairs(int[] nums) {
        int freq[] = new int[101];
        int count=0;
        for(int i=0;i<nums.length;i++){

            freq[nums[i]]++; 
        }

        for(int num:freq){
            count += num*(num-1)/2;
        }
        return count;
    }
}