class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> setList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        helper(nums, 0, nums.length, setList, list);
        return setList;
    }

    public static void helper(int []nums, int start, int n, ArrayList<List<Integer>>setList, ArrayList<Integer>list){
        if(start==n){
            setList.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[start]);
        helper(nums, start+1,n, setList, list);
        list.remove(list.size()-1);
        helper(nums,start+1, n, setList, list);
    }
}