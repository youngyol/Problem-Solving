// https://www.acmicpc.net/problem/10845

#include <iostream>
#include <string> 
#include <queue>
using namespace std;

int main(int argc, char **argv) {
	queue <string> q;

	int size = 0;
	int choice = 0;
	string A;

	cin >> size;
	getchar();
	for (int i = 0; i < size; i++) {

		getline(cin, A);

		if (A.find("push") == 0) {
			string res = A.substr(5);
			q.push(res);
		}
		else if (A.find("pop") == 0) {

			if (q.empty())
				cout << "-1" << endl;
			else {
				cout << q.front() << endl;
				q.pop();
			}
		}
		else if (A.find("size") == 0) {
			cout << q.size() << endl;
		}
		else if (A.find("front") == 0) {
			if (q.empty())
				cout << "-1" << endl;
			else {
				cout << q.front() << endl;
			}
		}
		else if (A.find("back") == 0) {
			if (q.empty())
				cout << "-1" << endl;
			else {
				cout << q.back() << endl;
			}
		}
		else if (A.find("empty") == 0) {
			if (q.empty())
				cout << "1" << endl;
			else
				cout << "0" << endl;

		}


	}
	return 0;
}
