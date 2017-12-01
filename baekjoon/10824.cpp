// https://www.acmicpc.net/problem/10824

#include <iostream>
#include <string> 
#include <stack>
#include <vector>
using namespace std;

int main(int argc, char **argv) {
	long long int  a, b, c, d;
	string A;
	// getline(cin,A); 
	cin >> a >> b >> c >> d;
	 
	string s;
	s = to_string(a);
	s.append(to_string(b));

	long long int n1 = stoll(s);
	s.clear();

	s = to_string(c);
	s.append(to_string(d));


	long long int n2 = stoll(s);

	cout << n1+n2;



	return 0;
}
