//https://leetcode.com/problems/diameter-of-binary-tree/description/
//543. Diameter of Binary Tree
class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return max;
    }
    public  int diameter(TreeNode root){
        if(root == null) return 0;

        int left = diameter(root.left);
        int right = diameter(root.right);
        
        max = Math.max(max, left+right);

        return Math.max(left, right)+1; 
    }
}