// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            // map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            // if(map.get(nums[i])==(nums.length/3)+1)list.add(nums[i]);
            int count;
            if(map.containsKey(nums[i])){
                count= map.get(nums[i])+1;
                if(count == nums.length/3 +1) {
                    list.add(nums[i]);
                }

            }else{
                count = 1;
            }
            map.put(nums[i],count);

            
        }
        return list;
    }
}

// Optimal Approach
// class Solution{
//     public List<Integer> majorityElement(int[] nums){
//          int n1 = 10, n2 = 20;
//     int count1 = 0, count2 = 0;
//     int n = nums.length;
//     List<Integer>list = new ArrayList<>();
//     for(int i=0;i<n;i++){
//         if(nums[i]==n2){
//             count2++;
//         }else if(nums[i]==n1){
//             count1++;
//         }else if(count1==0){
//             n1= nums[i];
//             count1 = 1;
//         }else if(count2 ==0){
//             n2 = nums[i];
//             count2 = 1;
//         }
//         else{
//             count1--;
//             count2--;
//         }

       
//     }

//         count1=0;
//         count2=0;

//     for(int num:nums){
//             if(num == n1) count1++;
//             else if(num == n2)count2++;
//     }

//         if(count1> n/3) list.add(n1);
//         if(count2> n/3) list.add(n2);
        
//     return list;
 
//     }
// }