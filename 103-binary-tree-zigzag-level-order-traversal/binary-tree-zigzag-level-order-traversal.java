/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int index = 0;
        boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>(size);
            for(int i = 0;i< size;i++){
                TreeNode curr = q.poll();
                index = flag ? i : 0;
                list.add(index, curr.val);
                
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

            }
            flag = !flag;
            res.add(list);
        }
        return res;

    }
}