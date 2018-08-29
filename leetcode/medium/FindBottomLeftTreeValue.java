// https://leetcode.com/problems/find-bottom-left-tree-value/description/

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
    public int findBottomLeftValue(TreeNode root) {
        int mostLeftValue =  root.val;     
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
          TreeNode temp = queue.poll();
          if(temp == null){
               queue.add(null);
              if(queue.peek() == null) break;
              else{
                  mostLeftValue = queue.peek().val;
                  continue;
              }
          }

          if(temp.left != null)
              queue.add(temp.left);
          if(temp.right != null)
              queue.add(temp.right);
        }
        return mostLeftValue;
    }
}
