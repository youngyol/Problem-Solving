// https://www.acmicpc.net/problem/1158

#include <iostream>
#include <string> 
#include <queue>
using namespace std;

int main(int argc, char **argv) {
	queue <int> q;
	int a, b;
	int cnt = 0;
	string A;
	cin >> a >> b;
	getchar();
	if (b >= 1 &&b  <= a && a <= 5000) {
	for (int i = 1; i <= a; i++)
		q.push(i);
	 
	if (!(q.empty()))  cout << "<";
	while (q.empty() == 0) {
		if (q.size() > 1)
		{
			for (int j = 0; j < b-1; j++) {
				int tmp = q.front();
				q.pop();
				q.push(tmp);
			}
			cout << q.front() << ", ";
			q.pop();
		}
		else {
			cout << q.front() << ">";
			q.pop();
		}
	}

	}
	return 0;
}
