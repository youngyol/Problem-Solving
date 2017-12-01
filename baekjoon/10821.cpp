// https://www.acmicpc.net/problem/10821

#include <iostream> 
#include <string>

using namespace std; 
int main(){
	int cnt = 0; 
	string str;  
	while (getline(cin, str, ',')) { // getline의 3번째 파라미터는 구분자를 뜻함, 어디까지 입력을 받을지를 구분해줌
		cnt++;
	}
	cout << cnt << "\n";
}
