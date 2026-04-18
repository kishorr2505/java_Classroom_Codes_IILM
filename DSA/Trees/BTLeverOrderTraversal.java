// 102 . binary Tree level Order Traversal
//https://leetcode.com/problems/binary-tree-level-order-traversal/description/
 import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)return result;
        q.offer(root);

        while(!q.isEmpty()){
            List<Integer>list = new ArrayList<>();
            int currSize  = q.size();

            for(int i=0;i<currSize;i++){
                TreeNode curr = q.poll();

                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

                list.add(curr.val);
            }

            result.add(list);
        }

        return result;
    }
}