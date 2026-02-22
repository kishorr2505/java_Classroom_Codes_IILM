//https://leetcode.com/problems/majority-element/description/
// problem No: 169

import java.util.HashMap;
import java.util.Map;

class MajorityElementNby2{

    // ******less Optimized due to space*******
    public static int majorityElement(int[] nums) {
       int length = nums.length;
        Map<Integer, Integer>map = new HashMap<>();
        int count = -1;
        for(int i=0;i<nums.length;i++){
            count =  map.getOrDefault(nums[i],0) +1;
            if(count > length/2) 
                return nums[i];

            map.put(nums[i],count);

        }
        return -1;
    }   


//******More Optimized********/
    // public static int majorityElement(int[] nums){
    //     int candidate = 10;
    //     int count = 0;

    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==candidate){
    //             count++;
    //         }else if(count==0){
    //             candidate = nums[i];
    //             count = 1;
    //         }else{
    //             count--;
    //         }
    //     }
    //     return candidate;
    // }


    
    public static void main(String[] args) {
       int element =  majorityElement(new int[]{1,2,2,2,1,1});
        if(element!=-1){
            System.out.println(element);
        }else{
            try{
                throw new Exception();
            }catch(Exception e){
                System.out.println("No majority element Present");
            }
            
        }
    
    }
}
