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

    int res=-1;
    public int diameterOfBinaryTree(TreeNode root) {
        //Approach:
        
        findDia(root);
        return res;        
    }
    public int findDia(TreeNode root){
        if(root==null)
            return -1;
        int lft= 1+findDia(root.left);
        int rit= 1+findDia(root.right);
        res= Math.max(res,(lft+rit));
        return Math.max(lft, rit);
    }
}