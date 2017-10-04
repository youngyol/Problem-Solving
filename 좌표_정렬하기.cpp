// https://www.acmicpc.net/problem/11650

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main() {
	int n,x,y;
	cin >> n;
	vector<pair<int,int>> answer;
	while (n-- > 0) {
		pair<int, int> tmp;
		scanf("%d %d",&tmp.first, &tmp.second);
		answer.push_back(tmp);
	}
	sort(answer.begin(), answer.end());

	for (pair<int, int> point : answer)
		printf("%d %d\n", point.first, point.second);

}
