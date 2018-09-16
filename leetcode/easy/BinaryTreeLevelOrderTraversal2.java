// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
   List<List<Integer>> answer;

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        answer = new ArrayList<>();
        traversal(root, 0);
        Collections.reverse(answer);
        return answer;
    }

    public void traversal(TreeNode root, int level) {
        if (root == null) return;
        List<Integer> tmp = new ArrayList<>();
        if (answer.size() < level+1) {
            tmp.add(root.val);
            answer.add(tmp);
        } else {
            tmp = answer.get(level);
            tmp.add(root.val);
            answer.remove(level);
            answer.add(level,tmp);
        }

       traversal(root.left, level+1);
       traversal(root.right, level+1);
    }

}
