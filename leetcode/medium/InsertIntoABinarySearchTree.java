// https://leetcode.com/problems/insert-into-a-binary-search-tree

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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        search(root, val);
        return root;
    }

    private void search(TreeNode cur, int val){
        if(cur==null) return ;
        if(cur.val < val ){
            if(cur.right != null){
                search(cur.right,  val);
            } else{
                 cur.right = new TreeNode(val);
            }     
        } else {
            if(cur.left != null){
                search(cur.left,  val);
            } else{
                 cur.left = new TreeNode(val);
            }     
        }
        return;
    } 
}
