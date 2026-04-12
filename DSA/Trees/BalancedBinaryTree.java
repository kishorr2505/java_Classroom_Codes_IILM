// Leetcode Q.110 : Balanced Binary Tree
//https://leetcode.com/problems/balanced-binary-tree/description/
class Solution {
    public boolean isBalanced(TreeNode root) {
       if(root == null) return true;
       return heightCheck(root) !=-1;
        
    }

    public static int heightCheck(TreeNode root){
        if(root == null) return 0;

        int leftHeight = heightCheck(root.left);
        if(leftHeight == -1) return -1;

        int rightHeight = heightCheck(root.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight- rightHeight)>1) return -1;
        return Math.max(leftHeight, rightHeight) +1;
    }
}
