// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int cnt = 0, zeroCnt = 0, maxCar = 1000000000;
        boolean meetZero=false;
        
        for(int num : A ){
            if(cnt >= maxCar) return -1;
            if(num == 1 && meetZero){
                cnt+=zeroCnt;
            } 
            else if(num==0){
                meetZero =true;
                zeroCnt++;
            }
        }
        return cnt;
    }
}
