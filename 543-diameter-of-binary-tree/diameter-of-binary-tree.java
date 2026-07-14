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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).diam - 1 ;
    }
    static class TreeInfo{
        int height;
        int diam;
        TreeInfo(int height, int diam){
            this.height=height;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter(TreeNode root){
        if(root == null){
            return new TreeInfo (0, 0);
        }
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);
        int height = Math.max(left.height, right.height) +1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.height + right.height + 1;
        int diamtr = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo info = new TreeInfo(height, diamtr);
        return info;
    }
}