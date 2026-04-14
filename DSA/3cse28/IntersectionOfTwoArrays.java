class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer>list = new ArrayList<>();
        int [] result;
        int i=0, j=0;
        while(i<nums1.length && j< nums2.length){
            if(nums1[i]==nums2[j]){
                if(list.isEmpty() || list.get(list.size()-1)!= nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        
        result = new int[list.size()];
        for(i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
            
    }
}