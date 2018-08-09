// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<A.length;i++){
            set.add(A[i]);
        }
        if(set.size()!= A.length)
            return 0;
        Arrays.sort(A);
        return (set.size() == A[A.length-1])?1:0;
    }
}
