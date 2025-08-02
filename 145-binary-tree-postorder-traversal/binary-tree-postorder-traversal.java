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
    public List<Integer> postorderTraversal(TreeNode root) {
        // List<Integer> ls = new ArrayList<>();
        // postorder(root, ls);
        // return ls;

        // List<Integer> list = new ArrayList<>();
        // Stack<TreeNode> s1 = new Stack<TreeNode>();
        // Stack<TreeNode> s2 = new Stack<TreeNode>();

        // if(root == null) return list;
        // s1.push(root);
        // while(!s1.isEmpty()){
        //     root=s1.pop();
        //     s2.push(root);
        //     if(root.left != null) s1.push(root.left);
        //     if(root.right != null) s1.push(root.right);

        // }

        // while(!s2.isEmpty()){
        //     list.add(s2.pop().val);

        // }
        // return list;


        Stack<TreeNode> s1=new Stack<TreeNode>();
        List<Integer> post= new ArrayList<>();

        TreeNode curr=root;
        TreeNode temp=null;

        while(curr!=null || !s1.isEmpty()){
            if(curr!=null){
                s1.push(curr);
                curr=curr.left;
            }
            else{
                temp=s1.peek().right;
                if(temp==null){
                    temp=s1.pop();
                    
                    post.add(temp.val);
                    while(!s1.isEmpty() && temp==s1.peek().right){
                        temp = s1.pop();
                        
                        post.add(temp.val);
                    }
                }
                else{
                    curr=temp;
                }
            }
        }
        return post;
    }
    // public void postorder(TreeNode root, List<Integer> ls){
    //     if(root == null ) return;
    //     postorder(root.left, ls);
    //     postorder(root.right, ls);
    //     ls.add(root.val);
    // }
}