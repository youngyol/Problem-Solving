// https://leetcode.com/problems/n-ary-tree-preorder-traversal/

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
    List<Integer> answer =  new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null) {
            return answer; 
        }
        answer.add(root.val);
        
        for(Node children : root.children){
            preorder(children);
        } 
        return answer;
    } 
 
}
