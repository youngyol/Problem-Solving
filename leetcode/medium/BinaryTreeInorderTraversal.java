// https://leetcode.com/problems/binary-tree-inorder-traversal/description/

import java.util.*;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        inorderTraversal(root,answer);
        return answer;
    }
    void inorderTraversal(TreeNode node, List<Integer> answer){
        if (node == null)
               return;
        inorderTraversal(node.left, answer);
        answer.add(node.val);
        inorderTraversal(node.right, answer);
    }

}
