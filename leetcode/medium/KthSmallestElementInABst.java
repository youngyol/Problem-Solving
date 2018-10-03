// https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/

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
    private int targetIdx;
    private int curIdx=1;
    private int answer;
    public int kthSmallest(TreeNode root, int k) {
        targetIdx=k;
        inorderTraversal(root);
        return answer;
    }
    
     public void inorderTraversal(TreeNode node){
         if(node==null) return;
         inorderTraversal(node.left);
         if(curIdx++==targetIdx){
             answer=node.val;
         }
         inorderTraversal(node.right);
         
     }
}
