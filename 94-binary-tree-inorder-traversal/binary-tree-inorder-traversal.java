// 94. Binary Tree Inorder Traversal
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //Approach: Using Recursion
        //TC:O(n)| SC:O(h)
        List<Integer> ans= new ArrayList<Integer>(); 
        inorder(root, ans);
        return ans;
    }
    public void inorder(TreeNode root, List<Integer> ans)
    {
        if(root==null)
            return ;

        inorder(root.left, ans);
        ans.add(root.val);   
        inorder(root.right, ans);
    }
}