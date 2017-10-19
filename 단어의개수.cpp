// https://www.acmicpc.net/problem/1152

#include <iostream> 
#include <string>

using namespace std; 
int main(){
	int cnt = 0;
	string str; 
	while (cin >> str) {// cin은 입력을 받으면 true 아니면 false 를 return 
		cnt+=1;
	}
	cout << cnt <<"\n";
}
