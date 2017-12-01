// https://www.acmicpc.net/problem/1212

#include "string"
#include <iostream>
#include <stdio.h>

using namespace std;

string makeBinary(char a, int flag) {
	string result;

	if (a == '0' || a == '1' || a == '2' || a == '3') {
		if (flag == 0) {
			if (a == '0') result = "0";
			if (a == '1') result = "1";
			if (a == '2') result = "10";
			if (a == '3') result = "11";
		}
		else {
			if (a == '0') result = "000";
			if (a == '1') result = "001";
			if (a == '2') result = "010";
			if (a == '3') result = "011";
		}
	}
	if (a == '4') result = "100";
	if (a == '5') result = "101";
	if (a == '6') result = "110";
	if (a == '7') result = "111";
	return result;
}
int main() {
	string num;
	int len;

	cin >>num;
	len = num.length();

	for (int i = 0; i<len; i++) {
		cout << makeBinary(num[i], i);
	}

}
