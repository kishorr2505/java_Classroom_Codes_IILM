//Q.113 -> Path sum II
// https://leetcode.com/problems/path-sum-ii/description/
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        findPaths(root, new ArrayList<>(), result, targetSum);
        return result;
    }

    public static void findPaths(TreeNode root, List<Integer> currList , List<List<Integer>>result, int target){
        if(root == null) return;

        currList.add(root.val);

        if(root.left == null && root.right == null ){
            if(root.val == target) result.add(new ArrayList<>(currList));
        }else{
            findPaths(root.left, currList, result, target-root.val);
            findPaths(root.right, currList, result, target-root.val);
        }

        currList.remove(currList.size()-1);

    }
}