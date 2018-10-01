// https://leetcode.com/problems/maximum-binary-tree/description/

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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructTree(nums, 0, nums.length - 1);
    }

    private TreeNode constructTree(int[] nums, int start, int end) {
        int maxIdx = findMax(nums, start, end); 
        TreeNode tmp = new TreeNode(nums[maxIdx]);
        
        int nextLeftIdx = maxIdx - 1;
        int nextRightIdx = maxIdx + 1;
        if (start <= nextLeftIdx)
            tmp.left = constructTree(nums, start, nextLeftIdx);
        if (end >= nextRightIdx)
            tmp.right = constructTree(nums, nextRightIdx, end);
        return tmp;
    }

    private int findMax(int[] arr, int start, int end) {
        int max = arr[start], idx = start;
        for (int i = start; i <= end; i++) {
            if (max < arr[i]) {
                idx = i;
                max = arr[i];
            }
        }
        return idx;
    }
}
