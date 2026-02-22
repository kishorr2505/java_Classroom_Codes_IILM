// https://leetcode.com/problems/majority-element-ii/description/
// Question 229

import java.util.ArrayList;
import java.util.List;


public class MajorityElementNby3 {
    public static List<Integer> majorityElement(int[] nums){
        int n1 = 10, n2 = 20;
        int count1 = 0, count2 = 0;
        int n = nums.length;
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==n2){
                count2++;
            }else if(nums[i]==n1){
                count1++;
            }else if(count1==0){
                n1= nums[i];
                count1 = 1;
            }else if(count2 ==0){
                n2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;

        for(int num:nums){
            if(num == n1) count1++;
            else if(num == n2)count2++;
        }

        if(count1> n/3) list.add(n1);
        if(count2> n/3) list.add(n2);
        
    return list;
 
    }

    public static void main(String[] args){
        List<Integer>list = new ArrayList<>(majorityElement(new int[]{1,1,2,2,5,1,5}));

        for(int ele: list){
            System.out.print(ele+" ");
        }
    }
}
