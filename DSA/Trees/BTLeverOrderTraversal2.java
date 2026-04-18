// Q.107 -> BT level Order Traversal II
//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> finResult = new ArrayList<>();
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

    for(int i=result.size()-1;i>=0;i--){
        finResult.add(result.get(i));
    }

    return finResult;
       
    }
}