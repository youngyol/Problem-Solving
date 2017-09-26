// https://www.acmicpc.net/problem/1541

#include <string>
#include <vector>
#include <string.h>
#include <stdio.h>
#include <iostream>

using namespace std;


vector<string> split(string str, string sep) {
	char* cstr = const_cast<char*>(str.c_str());
	char* current;
	vector<string> arr;
	current = strtok(cstr, sep.c_str());
	while (current != NULL) {
		arr.push_back(current);
		current = strtok(NULL, sep.c_str());
	}
	return arr;
}
int main() {
	vector<string> arr;
	string problem;
	cin >> problem; 
	arr = split(problem, "-");
	int tmp, answer = 0, cnt = 0;

	vector<string>  firstTndex = split(arr[0], "+");
	for (string plusStr : firstTndex)
		answer += stoi(plusStr);
	for (string str : arr) {
		if (cnt++ == 0) continue;
		tmp = 0;
		if (str.find("+") != string::npos) {
			vector<string> plusArr;
			plusArr = split(str, "+");
			for (string plusStr : plusArr)
				tmp += stoi(plusStr);
		}
		else {
			tmp += stoi(str); 
		}
		tmp *= -1;
		answer += tmp;

	}
	cout << answer << endl;
 
}
