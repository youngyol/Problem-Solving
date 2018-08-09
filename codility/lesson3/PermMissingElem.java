class Solution {
    public int solution(int[] A) {
        long N = A.length+1;
        long sumN =  (N*(N+1))/2;
        int sum = 0;
        
        for(int num : A)
            sum+=num;
            
        return (int) (sumN - sum);
    }
}
