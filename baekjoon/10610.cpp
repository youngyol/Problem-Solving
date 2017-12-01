// https://www.acmicpc.net/problem/10610

#include <algorithm>
#include <vector>  
#include <functional>
#include <iostream>

using namespace std;


int main() { 
	vector <int> sol;
	int answer = 0, idx = 0, zeroFlag = -1 , checkThree = 0;
	char str[1000001];

	scanf("%s", str);
	for (char tmp : str) {
		if (tmp == NULL) break;
		int num = tmp - '0';
		if (num == 0) zeroFlag = idx;
		else {
			checkThree += num;
		}
		sol.push_back(num);
		idx++;
	
	}
 
	if (zeroFlag == -1) {
		cout << zeroFlag << endl;
		return 0;
	}
	else if(checkThree%3 != 0) {

		cout << -1 << endl;
		return 0;
	
	}
	else {

		int size = sol.size();
		sort(sol.begin(), sol.end(), greater<int>());
		for (int i = 0; i < size - 1; i++) {
			cout << sol[i];
		}
		cout << 0 << endl;
	
	}
}
