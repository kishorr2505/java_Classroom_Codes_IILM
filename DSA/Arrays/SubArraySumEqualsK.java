 
 // bruteForce Approach
//  time = O(n^2) , space = O(1)
 class SubArraySumEqualsK {
        public int subarraySum(int[] nums, int k) {
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            int sum = 0;

            int j=i;
           do{
                sum += nums[j];
                if(sum ==k){
                    count++;
                }
                j++;
           }while(j<nums.length);



        }
        return count;
    }    
}

// Optimized using hashmap
// time = O(n), Space = O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer>map = new HashMap<>();
        int sum = 0;
        map.put(0,1);
        int count = 0;
        for(int i=0;i<nums.length;i++){
                sum+= nums[i];
                
                int need = sum - k;

                if(map.containsKey(need)){
                    count += map.get(need);
                }
                map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
