class Solution {
    public int solution(int A, int B, int K) { 
        return  ((B/K+1) -( (A==0)?0:((A-1)/K + 1)) );
    }
    
}
