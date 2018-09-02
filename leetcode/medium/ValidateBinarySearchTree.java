// https://leetcode.com/problems/validate-binary-search-tree/description/

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
    public boolean isValidBST(TreeNode root) {
        return dfs(root,  Long.MIN_VALUE,  Long.MAX_VALUE);
    }
    
    public boolean dfs(TreeNode root, long min, long max) {
        if(root == null )return true;
        if(root.val <= min || root.val >= max ) return false;
        
        boolean leftChk = dfs(root.left , min , root.val);
        boolean rightChk = dfs(root.right , root.val , max);
        
        return leftChk && rightChk;
    } 
}
