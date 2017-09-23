// https://programmers.co.kr/learn/challenge_codes/158

#include<iostream>
#include<vector>

using namespace std;
string arr[3] = {"4","1","2"};
bool flag =false;
string change124(int no){
  string answer ="";
  int mod;
  while (no > 0){
    mod = no% 3 ;
  	no = no/3;
    if(mod == 0) no--;
    answer = (arr[mod]+"") + answer;
  
  }
	return answer;
}
int main()
{ 
  
  
  int testNo = 139999;
	string testAnswer = change124(10);

	cout<<testAnswer;
}
