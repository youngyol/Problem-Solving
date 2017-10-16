// https://www.acmicpc.net/problem/10451

#include <iostream>
using namespace std;

int points[1001];
bool check[1001];
int dfs(int x) {
	if (check[x]) return x;
	check[x] = true;
	return dfs(points[x]);
}
int main() {
	int T;
	cin >> T;
	while (T-- > 0) {
		int N;
		cin >> N;
		for (int i = 1; i <= N; i++) {
			scanf("%d", &points[i]);
			check[i] = false;
		}
		int ans = 0;
		for (int i = 1; i <= N; i++) {
			if (check[i] == false) {
				if( i ==  dfs(i)) ans+=1;
			}
		}
		cout << ans << '\n';
	}
	 
}
