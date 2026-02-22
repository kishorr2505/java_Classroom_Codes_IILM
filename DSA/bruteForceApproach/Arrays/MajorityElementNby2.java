//https://leetcode.com/problems/majority-element/description/
// problem No: 169

class MajorityElementNby2{
    public static int majorityElement(int[] nums){
        if(nums.length==1) return nums[0];

            for(int i=0;i<nums.length-1;i++){
                int count = 1;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]) count++;
                    if(count > nums.length /2) return nums[i];
                }

            }
        return -1;
    }   
    
    public static void main(String[] args) {
       int element =  majorityElement(new int[]{1,2,2,1,1});
        System.out.println(element);
    
    }
}
