// https://programmers.co.kr/learn/challenge_codes/171

#include<iostream>
using namespace std;

int isPrime(int n ){

  for(int i = 2; i <= n-1; i++){
    if(n%i == 0) return 0;
  }
  return 1;
}

int numOfPrime(int n)
{
    int answer = 0;
    while( n > 2){
    if( isPrime( n ) ) answer ++;
    n--;
  }

  if( n == 2 ) answer ++;
    return answer;
}

int main()
{
    int testCase = 10;
    int testAnswer = numOfPrime(testCase);

    cout<<testAnswer;
}
