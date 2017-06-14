// https://www.acmicpc.net/problem/11656

#include <iostream>
#include <string> 
#include <stack>
#include <vector>
#include <utility>
#include <algorithm>

using namespace std;

int main(int argc, char **argv) {
	long long int  a, b, c, d;
	string A;
	getline(cin,A); 
	vector <string> str;

	if (A.size() > 1000)
		return 0;
	for (int i = 0; i < A.size(); i++) {
		if ('a' <= A[i] && A[i] <= 'z');
		else return 0;

	}
	for (int i = 0; i < A.size(); i++) {
		str.push_back(A.substr(i));
	}

	sort(str.begin(),str.end());


	for (int i = 0; i < A.size(); i++) {
		cout << str[i] <<endl;
	}


	return 0;
}
