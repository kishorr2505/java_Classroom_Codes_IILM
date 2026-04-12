// Question leetcode 104 -  maximum depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

class Solution {
    int maxCount = 0;
    
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return leftHeight >= rightHeight ? leftHeight +1 : rightHeight +1;

    }
}