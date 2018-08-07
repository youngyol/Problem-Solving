class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int len = A.length;
        if(len == 0 || K == 0) return A;
        int [] res = new int[len];
         for (int i = 0; i < len; i++) {
            int idx = (i + K) % len;
            res[idx] = A[i];
        }
        return res;
    }
}   

