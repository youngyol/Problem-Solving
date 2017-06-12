// https://www.acmicpc.net/problem/10866

#include <iostream>
#include <string> 
#include <deque>
using namespace std;

int main(int argc, char **argv) {
	deque<string> dq;
	int a, b;
	int cnt = 0;
	int size = 0;
	int choice = 0;
	string A;

	cin >> size;
	getchar();
	for (int i = 0; i < size; i++) {

		getline(cin, A);

		if (A.find("push_front") == 0) {
			string res = A.substr(11);
			dq.push_front(res);
		}
		else if (A.find("push_back ") == 0) {
			string res = A.substr(10);
			dq.push_back(res);
			
		}
		else if (A.find("pop_front") == 0) {

			if (dq.empty())
				cout << "-1" << endl;
			else {
				cout << dq.front() << endl;
				dq.pop_front();
			}
		}
		else if (A.find("pop_back") == 0) {

			if (dq.empty())
				cout << "-1" << endl;
			else {
				cout << dq.back() << endl;
				dq.pop_back();
			}
		}
		else if (A.find("size") == 0) {
			cout << dq.size() << endl;
		}
		else if (A.find("front") == 0) {
			if (dq.empty())
				cout << "-1" << endl;
			else {
				cout << dq.front() << endl;
			}
		}
		else if (A.find("back") == 0) {
			if (dq.empty())
				cout << "-1" << endl;
			else {
				cout << dq.back() << endl;
			}
		}
		else if (A.find("empty") == 0) {
			if (dq.empty())
				cout << "1" << endl;
			else
				cout << "0" << endl;

		}


	}
	return 0;
}
