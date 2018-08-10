// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
            // write your code in Java SE 8
        boolean[] crossed = new boolean[X+1];
        int size = X, idx =-1;
        for(int i=0; i<A.length; i++){
            if(!crossed[A[i]] && X >= A[i]){
                crossed[A[i]]=true;
                idx = i;
                size--;
                if(size== 0 ) return idx;
            }
        }
        return -1;
    }
}
