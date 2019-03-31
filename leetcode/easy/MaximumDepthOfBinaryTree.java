// https://leetcode.com/problems/maximum-depth-of-binary-tree/


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
    private int max = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) return max;
        // bfs(root);
        dfs(root, 1);
        return max;
    }

    private void bfs(TreeNode element) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(element);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right); 
            }
            max++; 
        }

    }
    
    
    private void dfs(TreeNode element, int curDepth) {
          if (element == null) return; 
          max = Math.max(max,curDepth);
          dfs(element.left, curDepth + 1);
          dfs(element.right, curDepth + 1);
    }
 
}
