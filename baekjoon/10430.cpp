// https://www.acmicpc.net/problem/10430

#include <iostream>
#include <string> 
#include <deque>
#include <algorithm>
#include <sstream>
#include <vector>
using namespace std;

int main(int argc, char **argv) {
	int a, b, c;
	
	cin >> a >> b >> c ;
	if(a < 2 || a > 10000)	return 0;
	if(b < 2 || b > 10000)	return 0;
	if(c < 2 || c > 10000)	return 0;


	cout << (a+b) % c << endl;
	cout << (a%c + b%c) % c << endl;
	cout << (a*b) % c << endl;
	cout << ((a%c) * (b%c)) % c << endl;
	
}

