// https://leetcode.com/problems/sum-of-left-leaves/

/**
* Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root!=null) solve(root);
        return sum;
    }
    
    private boolean solve(TreeNode node){
        if(node.left!=null){
            boolean isLeaf = solve(node.left);
            if(isLeaf) sum+=node.left.val;
        } 
        if(node.right!=null){
            solve(node.right); 
        }
        return node.left == null && node.right == null ;
    }
}
