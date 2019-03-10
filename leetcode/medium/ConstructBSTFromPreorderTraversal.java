// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

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
    int idx = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return makeBstTree(preorder, Integer.MAX_VALUE);
    }

    private TreeNode makeBstTree(int[] preorder, int max) {
        if (idx == preorder.length || preorder[idx] > max)
            return null;
        TreeNode node = new TreeNode(preorder[idx++]);
        node.left = makeBstTree(preorder, node.val);
        node.right = makeBstTree(preorder, max);
        return node;
    }
}
