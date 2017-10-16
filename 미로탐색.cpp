// https://www.acmicpc.net/problem/2178

#include <cstdio> 
#include <queue>

using namespace std;

int dir[4][2] = { { 0, 1 },{ 0, -1 },{ 1, 0 },{ -1, 0 } };
int table[101][101];
bool chk[101][101];
queue <pair <int, int>> q;

int main() {
	int M, N, ans = 1;
	scanf("%d%d", &N, &M);

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			scanf("%1d", &table[i][j]);
		}
	}

	q.push(make_pair(0, 0));
	chk[0][0] = true;
	while (!q.empty()) {
		int sz = q.size();
		for (int z = 0; z < sz; z++) {
			int x = q.front().first;
			int y = q.front().second;
			q.pop();
			if (x == N - 1 && y == M - 1) return 0 & printf("%d", ans);
			for (int k = 0; k < 4; k++) {
				int dx = x + dir[k][0];
				int dy = y + dir[k][1];
				if (dx<0 || dy<0 || dx >= N || dy >= M) continue;
				if (chk[dx][dy] || !table[dx][dy]) continue;

				chk[dx][dy] = true;
				q.push(make_pair(dx, dy));
			}

		}
		ans++;



	}
	return 0;

}
