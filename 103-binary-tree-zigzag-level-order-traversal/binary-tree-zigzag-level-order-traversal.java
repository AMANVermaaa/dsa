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
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root==null) return list;

        Queue<TreeNode> q = new LinkedList<>();
        boolean leftToRight=true;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level = new ArrayList<>(size);
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                
                int index= (leftToRight) ? i : 0;

                level.add(index, temp.val);
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);

            }
            leftToRight = !leftToRight;
            list.add(level);

        }
        return list;

    }
}