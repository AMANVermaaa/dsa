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
    public List<Integer> preorderTraversal(TreeNode root) {
        // List<Integer> arr = new ArrayList<>();
        // if(root == null) return arr;
        // preorder(root,arr);
        // return arr;

        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            if(root.right !=null ) st.push(root.right);
            if(root.left != null) st.push(root.left);
            list.add(root.val);
        }
        return list;
    }
    // public void preorder(TreeNode root, List<Integer> arr){

    //     if(root==null){
    //         return;
    //     }
    //     arr.add(root.val);
    //     preorder(root.left, arr);
    //     preorder(root.right, arr);

    // }
}