// https://leetcode.com/problems/range-sum-of-bst/

class Solution {
    private int  sum=0;
    private int left,right;
    public int rangeSumBST(TreeNode root, int L, int R) {
        left=L;
        right=R;
        inOrderTraverse(root);
        return sum;
    }
    
    private void inOrderTraverse(TreeNode root){
        if(root == null ) return;
        inOrderTraverse(root.left);
        if(root.val >= left && root.val <= right ) sum+=root.val;
        inOrderTraverse(root.right);
    }
    
}
