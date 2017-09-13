// https://programmers.co.kr/learn/challenge_codes/147


#include<iostream>
using namespace std;

long long fibonacci(int n)
{
  if(n <= 1)
    return n;
  else
    return  fibonacci(n-1) + fibonacci(n-2) ;
}

long long fibonacciDP(int n)
{
  long long dp[100];
  dp[0] = 0;
  dp[1] = 1;
  int i;
  
  for(i = 2; i <= n;i++){
  	dp[i] = dp[i-2]+dp[i-1];
  }
  return dp[n];
}



int main()
{
	int testCase = 10;
	long long testAnswer = fibonacciDP(testCase);

	cout<<testAnswer;
}
