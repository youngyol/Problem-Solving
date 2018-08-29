/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode(int x) { val = x; }
* }
*/
import java.util.*;
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        int level = 0;
        List<Integer> maxValues = new ArrayList<>();
        Queue <TreeNode> queue = new LinkedList<>();
        
        if(root==null) return maxValues;
        queue.add(root);
        queue.add(null);
        maxValues.add(root.val);
        int max =Integer.MIN_VALUE;
        
        while(!queue.isEmpty()){
          TreeNode temp = queue.poll();
          if(temp == null){
              level++;
              queue.add(null);
              
              max =Integer.MIN_VALUE;
              if(queue.peek() == null) break;
              else{
                  maxValues.add(level,max);
                  continue;
              }
          }else{
            max = (max < temp.val)? temp.val:max;
            maxValues.set(level,max);
          }
          
          if(temp.left != null)
              queue.add(temp.left);
          if(temp.right != null)
              queue.add(temp.right);
        }
        return maxValues;
    }
}
