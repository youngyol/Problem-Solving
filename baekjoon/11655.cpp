// https://www.acmicpc.net/problem/11655

#include <iostream>
#include <string>

using namespace std;

int main(void) {
	string a;
	getline(cin, a);
	for (int i = 0; i < a.length(); i++)
	{
		if ((a[i] >= 'a' && a[i] <= 'z') || (a[i] >= 'A'&&a[i] <= 'Z')) {
			//small
			if (a[i] >= 'a' && a[i] <= 'z') {
				if (a[i] >= 'n' && a[i] <= 'z') {
					cout << static_cast<char>(a[i] - 13);
				}
				else {
					cout << static_cast<char>(a[i] + 13);
				}
			}
			//large
			else {
				if (a[i] >= 'N' && a[i] <= 'Z') {
					cout << static_cast<char>(a[i] - 13);
				}
				else {
					cout << static_cast<char>(a[i] + 13);
				}
			}
		}
		else {
			cout << a[i];
		}
	}
	cout << endl;
	return 0;
}
