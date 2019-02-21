// https://leetcode.com/problems/search-in-a-binary-search-tree

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
    public TreeNode searchBST(TreeNode root, int val) { 
        while(root!=null){
            if(root.val == val) return root;
            if(root.val > val){
                if(root.left == null) break;
                root = root.left;
            } else{
                if(root.right == null) break;
                root = root.right;
            }
        }
        return null;
    }
}
