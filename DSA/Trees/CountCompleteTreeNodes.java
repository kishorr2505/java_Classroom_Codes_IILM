// Q222. Count Complete Tree Nodes
// https://leetcode.com/problems/count-complete-tree-nodes/


public int countNodes(TreeNode root) {
             Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return 0;
        q.offer(root);
        int count =0;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            count++;
            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null) q.offer(curr.right);
        }
        return count;
    }