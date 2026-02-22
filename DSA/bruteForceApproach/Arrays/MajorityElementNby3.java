// https://leetcode.com/problems/majority-element-ii/description/
// Question 229

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNby3 {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
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

    public static void main(String[] args){
        List<Integer>list = new ArrayList<>(majorityElement(new int[]{1,0,2,2,5,1,5}));

        for(int ele: list){
            System.out.print(ele+" ");
        }
    }
}
