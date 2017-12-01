// https://www.acmicpc.net/problem/1927

#include <cstdio>
#include <iostream>
#include <set>
#include <queue>

using namespace std;

int main(){
	int N;

	cin >> N;

	priority_queue<int> max_heap;
	while (N-- > 0) {
		int num;
		cin >> num;
		if (num == 0) {
			if (max_heap.empty()) cout << "0\n";
			else {
				cout << max_heap.top() *-1 << "\n";
				max_heap.pop();
			}
		}
		else max_heap.push(num *-1);
	}
		
}
