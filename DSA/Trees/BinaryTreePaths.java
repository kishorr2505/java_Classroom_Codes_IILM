// https://leetcode.com/problems/binary-tree-paths/description/
// Q.257. Binary Tree Paths
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null) return list;
        paths(list, root,"");
        return list;
    }

    public static void paths(List<String>list, TreeNode root, String temp){
        if(root == null) return;

        if(temp != ""){
            temp = temp+ "->"+ root.val;
        }else{
            temp = temp + root.val;
        }
        paths(list,root.left, temp);
        paths(list, root.right, temp);

        if(root.left == null && root.right == null){
            list.add(temp);
        }

    }
}