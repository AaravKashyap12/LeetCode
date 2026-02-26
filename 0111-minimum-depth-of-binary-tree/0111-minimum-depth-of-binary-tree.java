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
    public int minDepth(TreeNode root) {
    if(root==null){
        return 0;
    }    
    int leftNodes=minDepth(root.left);
    int rightNodes=minDepth(root.right);
    return(leftNodes==0 || rightNodes==0)?leftNodes+rightNodes+1:Math.min(leftNodes,rightNodes)+1;
    }
}