// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/

class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int level = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0; i<size; i++){
                Node node = q.poll();
                for(Node children : node.children)
                    q.offer(children);
            }
            level++;
        }
        return level;
    }
}
