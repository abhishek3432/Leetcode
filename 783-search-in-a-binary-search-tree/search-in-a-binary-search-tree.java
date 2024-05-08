//700. Search in a Binary Search Tree
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // Approach: Binary Search Algorithm using recursion
        // Avg TC:O(log n)| SC:O(1)
        while (root != null) {
            if (val > root.val)
                root=root.right;
            else if (val < root.val)
                root=root.left;
            else
                return root;
        }

        return root;
    }
}