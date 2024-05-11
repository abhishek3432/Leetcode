//701. Insert into a Binary Search Tree
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
         //Approach: Binary Search Algorithm to reach right position at leaf level using iteration
        // TC:O(log n)| SC:O(1)
        if (root==null)
        {
            return new TreeNode(val);
        }
        TreeNode newNode=new TreeNode(val);
        TreeNode dummy= root;
        while(dummy!=null)
        {
            if(newNode.val>dummy.val)
            {
                if(dummy.right==null)
                {
                    dummy.right=newNode;  
                    break;
                }
                dummy=dummy.right;
            }
            else if (newNode.val<dummy.val)
                    {
                        if(dummy.left==null)
                        {
                            dummy.left=newNode;;  
                            break;
                        }
                        dummy=dummy.left;
                    }                
        }
        return root;


        //Approach: Binary Search Algorithm to reach right 
        //position at leaf level using recursion
        // TC:O(log n)| SC:O(h)
        // if(root==null)
        //     return new TreeNode(val);
        
        // if(val > root.val) //if value is equal or greater than node value
        //     root.right= insertIntoBST(root.right, val);
        // else if(val < root.val)// if value is less than node value
        //         root.left= insertIntoBST(root.left, val);
        // return root;

    }
}