// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {   
        int[] result = new int[N];
        int len = A.length, max=0, curMax=0;
        
        for(int i=0; i<len; i++){
            if(1<=A[i] && A[i] <=N){
                if(max > result[A[i]-1]) result[A[i]-1] = max+1;
                else result[A[i]-1]++;
                curMax = (curMax < result[A[i]-1])?result[A[i]-1]:curMax;
            }
            else if(A[i]==N+1) max = curMax;
        }
        
         for(int i=0; i<result.length; i++){
            if(result[i] < max ) result[i] =max;
        }
        
        return result;
        
    }
}
