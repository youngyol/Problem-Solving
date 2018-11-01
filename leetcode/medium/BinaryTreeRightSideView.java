// https://leetcode.com/problems/binary-tree-right-side-view/


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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<Integer>();
        return bfs(root);
    }
    
    private List<Integer> bfs(TreeNode node){
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        
        q.offer(node);
        
        while(!q.isEmpty()){
            int size = q.size();    
            for(int i=0; i<size; i++){
                TreeNode curNode = q.poll();
                if(curNode.left!=null) q.offer(curNode.left);
                if(curNode.right!=null) q.offer(curNode.right);
                if(size-1 == i ) ans.add(curNode.val);
            }
        }
        return ans;
    }
}
