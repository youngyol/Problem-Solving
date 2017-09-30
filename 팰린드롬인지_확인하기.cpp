// https://www.acmicpc.net/problem/10988
 
#include <string>
#include <iostream>
#include<cstdio> 
using namespace std;
//2번
int checkStr(string str) {

	string w = str;
	for (int i = 0; i < w.size() / 2; i++)
	{
		if (w[i] != w[w.size() - i - 1])
			return 0;

	}
	return 1;
}
int main() {
	string testStr;
	cin >> testStr;
	cout << checkStr(testStr) <<endl;

}
