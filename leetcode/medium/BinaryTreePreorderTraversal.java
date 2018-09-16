// https://leetcode.com/problems/binary-tree-preorder-traversal/description/

/**
* preorder  : root -> L -> R
* inorder   : L -> root -> R
* postorder : L -> R -> root
**/

import java.util.*;
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        traversal(root,answer);
        return answer;
        
    } 
    void traversal(TreeNode node, List<Integer> answer){
        if (node == null)
               return;
        answer.add(node.val);
        traversal(node.left, answer);
        traversal(node.right, answer);
    }

}
