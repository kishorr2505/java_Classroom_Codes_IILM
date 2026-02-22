import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElements {
    public int[] rearrangeArray(int[] nums) {
        List<Integer>positive = new ArrayList<>();
        List<Integer>negative = new ArrayList<>();

        for(int num:nums){
            if(num<0){
                negative.add(num);
            }else{
                positive.add(num);
            }
        }
        int i=0;
        int p=0;
        int n = 0;
        while(i<nums.length){
           

            if(i%2==0){
                nums[i]= positive.get(p);
                p++;
            }else{
                nums[i] = negative.get(n);
                n++;
            }
            i++;
        }

    return nums;
    }
}


// More optimized

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive = 0;
        int negative = 1;

        int result[] = new int[nums.length];

        for(int idx = 0 ;idx<nums.length;idx++){
            if(nums[idx]>0){
                result[positive] = nums[idx];
                positive += 2;
            }else{
                result[negative] = nums[idx];
                negative += 2;
            }
        }

    return result;
    }
}