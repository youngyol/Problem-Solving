// https://programmers.co.kr/learn/courses/30/lessons/12914?language=java

class Solution {
    private long[] dp = new long[2000];
    public long solution(int n) { 
        if( n <= 2)  return  n;
        if(dp[n]!=0) return dp[n];
        dp[n] = solution(n - 2) + solution( n - 1);
        return dp[n]%1234567;
  }
  
}
