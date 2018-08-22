
import java.util.Arrays;


class Solution {
    public static int solution(int[] A) {
        Arrays.sort(A);
        int len = A.length;
        int negative = A[0]*A[1]*A[len-1];
        int positive = A[len-1]*A[len-2]*A[len-3];
        return (negative>positive)? negative : positive;
    }
}
