// https://www.acmicpc.net/problem/11729

#include <vector>   
#include <iostream>

using namespace std;

vector<pair<int, int>> answer;
int cnt=0;
void solve(int num, int from, int to) {
	if (num == 0) return ;
	cnt++;
	solve(num - 1, from, 6 - from -to);
	pair<int, int> tmp;
	tmp.first = from;
	tmp.second = to;
	answer.push_back(tmp); 
	solve(num - 1, 6 - from - to,to);
}

int main() { 
	int num;

	scanf("%d", &num);
	solve(num, 1, 3);
	printf("%d\n", cnt);
	for (pair<int, int> item : answer) {
		printf("%d %d\n", item.first, item.second);
	}

}
