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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //Approach: Binary Search Algorithm to reach right position at leaf level 
        // TC:O(log n)| SC:O(h)

        if(root==null)
            return new TreeNode(val);
        
        if(val>=root.val) //if value is equal or greater than node value
            root.right= insertIntoBST(root.right, val);
        else // if value is less than node value
                root.left= insertIntoBST(root.left, val);
        return root;

        


    }
}