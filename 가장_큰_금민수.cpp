// https://www.acmicpc.net/problem/1526

#include <iostream>
#include<queue>

using namespace std; 

int main() { 
	queue<string> Queue;
	string tmp = "";
	int max, value= 0, answer = 0;
	cin  >> max;
	Queue.push("4");
	Queue.push("7");
	do {
		tmp = Queue.front();
		Queue.pop();
		Queue.push(tmp + "4");
		Queue.push(tmp + "7");
		answer = value;
		value = atoi(tmp.c_str());
		if (max < value) break;
	} while (true);

	cout << answer;
}
