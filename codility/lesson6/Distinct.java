// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


class Solution {
    public int solution(int[] A) {
        Set<Integer> cnt = new HashSet();
        for(int num : A)
            cnt.add(num);
        return cnt.size();
    }
}
