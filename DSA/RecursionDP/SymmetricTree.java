// Leetcode Question 101 - Symmetric Tree
// https://leetcode.com/problems/symmetric-tree/description/
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    public boolean check(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null && rightNode == null) return true;
        if(leftNode == null || rightNode == null || leftNode.val != rightNode.val) return false;

        return (check(leftNode.left, rightNode.right) && check(leftNode.right, rightNode.left));
    }
}