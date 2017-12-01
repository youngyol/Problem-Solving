// https://www.acmicpc.net/problem/10820

#include <iostream> 
#include <string>

using namespace std;
int main() {
	int cnt = 0; 
	string str;
	while (getline(cin, str)) {
		int upper = 0, lower = 0, number = 0, space = 0;
		for (char x : str) {
			if (x >= 'a' && x <= 'z')lower++;
			else if (x >= 'A' && x <= 'Z')upper++;
			else if (x >= '0' && x <= '9')number++;
			else if (x == ' ') space++;
		}
		cout << lower << " " << upper << " " << number << " " << space << "\n";
	}
}
