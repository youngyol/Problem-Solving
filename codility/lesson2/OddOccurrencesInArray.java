// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
      Set<Integer> result = new HashSet<Integer>();
      for(int num : A){
          if(result.contains(num))
            result.remove(num);
          else
            result.add(num);
      }
       return result.iterator().next(); 
    }
}
