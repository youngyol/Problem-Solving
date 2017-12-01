// https://programmers.co.kr/learn/challenge_codes/144


#include<iostream>
#include<string>
using namespace std;

string caesar(string s, int n)
{
  int size = s.length();
	string answer = "";
  n %= 26;
  for(int i = 0; i < size; i++){
  	if(isspace(s.at(i) ) ) {
    	answer += " ";
      continue;
    }  
    if(s.at(i) + n > 'z' || (s.at(i) < 'a' && s.at(i) + n > 'Z' ))
      answer+= (char)(s.at(i) + n)-26; 
    else answer+= s.at(i) +n ;
  } 
	return answer;
}

int main()
{
	string text = "a B z";
	int testNo = 4;

	string testAnswer = caesar(text, testNo);

	cout<<testAnswer;
}
