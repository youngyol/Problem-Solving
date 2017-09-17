// https://programmers.co.kr/learn/challenge_codes/150

#include<iostream>
using namespace std;

int collatz(int num){
	int answer = 0;
	while(num != 1){
    num = (num % 2 == 0) ? num /2 : (num*3)+1; 
    answer++;
  	if(answer >= 500 ){
      answer = -1;
    	break;
    } 
  }
	return answer;
}

int main()
{
	int testCase = 6;
	int testAnswer = collatz(testCase);

	cout<<testAnswer;
}
