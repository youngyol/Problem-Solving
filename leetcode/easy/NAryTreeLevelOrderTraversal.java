// https://leetcode.com/problems/n-ary-tree-level-order-traversal/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);  
        List<List<Integer>> answer = new ArrayList<>(); 
        
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>();
        
            for(int i=0; i<size; i++) {
                Node node = queue.poll();
                tmp.add(node.val);        
                
                for(Node children : node.children){
                    queue.offer(children); 
                }

            }
            answer.add(tmp); 
            
        }
        return answer;
    }
}
