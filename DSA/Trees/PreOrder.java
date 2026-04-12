// Q.144 : Preorder
// https://leetcode.com/problems/binary-tree-preorder-traversal/description/

// using recursive approach , time = O(n) , space = O(H), H is height of the tree/ recursive stack space
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        if(root == null) return pre;
        preOrder(pre, root);
        return pre;
    }

    public static void preOrder(List<Integer>pre , TreeNode root){
        if(root==null) return;
        pre.add(root.val);
        preOrder(pre, root.left);
        preOrder(pre, root.right);
        
    }
}

// using iterative approach, time = O(n) , space = O(H), H = height 

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        if(root == null) return pre;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode curr = s.pop();
            pre.add(curr.val);
            
            if(curr.right != null) s.push(curr.right);
            if(curr.left != null) s.push(curr.left);



        }
        return pre;
       
    }

    
}