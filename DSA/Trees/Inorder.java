// Question: 94 Inorder Tree Traversal
// https://leetcode.com/problems/binary-tree-inorder-traversal/description/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        inOrder(list, root);
        return list;
    }

    public static void inOrder(List<Integer>list, TreeNode root){
        if(root==null) return ;
        inOrder(list, root.left);
        list.add(root.val);
        inOrder(list, root.right);
    }
}