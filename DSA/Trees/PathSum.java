// leetcode question 112 : path sum
//https://leetcode.com/problems/path-sum/description/
class Solution {
    public boolean hasPathSum(TreeNode root, int target) {
        if(root == null) return false;

        if(root.left == null && root.right == null){
            return root.val == target;
        }

        return hasPathSum(root.left, target-root.val) || hasPathSum(root.right, target-root.val);


    }
}