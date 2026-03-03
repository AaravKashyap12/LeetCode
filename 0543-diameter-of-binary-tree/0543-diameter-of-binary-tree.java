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
    private int height(TreeNode node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(height(node.left),height(node.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
    if(root==null){
        return 0;
    }    
    int leftheight = height(root.left);
    int rightheight = height(root.right);

    int currdiameter = leftheight+rightheight;

    int leftdiameter = diameterOfBinaryTree(root.left);
    int rightdiameter = diameterOfBinaryTree(root.right);


    return Math.max(currdiameter,Math.max(leftdiameter,rightdiameter));
    }
}