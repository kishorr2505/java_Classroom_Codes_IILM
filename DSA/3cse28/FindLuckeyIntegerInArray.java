class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int luckeyInt = -1;

        for(int num:map.keySet()){
            if(num == map.get(num)){
                luckeyInt = Math.max(luckeyInt, num);
            }
        }
        return luckeyInt;
    }
}