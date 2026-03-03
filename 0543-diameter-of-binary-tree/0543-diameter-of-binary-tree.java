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
    int maxDiameter = Integer.MIN_VALUE;

    private int height(TreeNode node) {
        if (node == null) return 0;

        int leftheight = height(node.left);
        int rightheight = height(node.right);
        maxDiameter=Math.max(maxDiameter,leftheight+rightheight);

        return Math.max(leftheight, rightheight) + 1;
        
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
          
}}