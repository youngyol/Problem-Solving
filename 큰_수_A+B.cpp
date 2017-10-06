// https://www.acmicpc.net/problem/10757

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;
 
int main() {
	string str1, str2;
	cin >> str1 >> str2;
	int str1Size = str1.size(), str2Size = str2.size();
	int carry = 0, leftStart = 0, rightStart = 0;
	vector <char> answer;

	reverse(str1.begin(), str1.end());
	reverse(str2.begin(), str2.end()); 

	while (leftStart < str1Size && rightStart < str2Size) { 

		int tmp = str1[leftStart++] - '0' + str2[rightStart++] - '0' + carry;
		carry = tmp / 10;
		tmp %= 10;

		answer.push_back(tmp + '0');
			 
	}
	 
	if (str1Size < str2Size) {
		for (int i = rightStart; i < str2Size; i++) {
			int tmp = str2[i] - '0' + carry;

			carry = tmp / 10;
			tmp %= 10;
			answer.push_back(tmp + '0');
		}
	}
	else {
		for (int j = leftStart; j < str1Size; j++) {
			int tmp = str1[j] - '0' + carry;

			carry = tmp / 10;
			tmp %= 10;
			answer.push_back(tmp + '0');
		}
	
	}
	if (carry != 0) answer.push_back(carry + '0');

	reverse(answer.begin(), answer.end());

	for (char number : answer) {
		printf("%c", number);
	}

}
