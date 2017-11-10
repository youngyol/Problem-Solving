 // https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem
 
 /* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
   boolean checkBST(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        result = inOrder(root, result);
        for(int i=0; i < result.size()-1; i++){
            if(result.get(i) >= result.get(i+1)) return false;
        }
        return true;
    }
    
    private ArrayList<Integer> inOrder(Node root, ArrayList<Integer> list){
        if(root == null) return null;
        else{
            if(root.left != null) inOrder(root.left, list);
            list.add(root.data);
            if(root.right != null) inOrder(root.right, list);
            return list;
        }
    }
