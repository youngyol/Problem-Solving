// https://www.acmicpc.net/problem/7576

#include<vector>
#include <iostream>
#include <queue>

using namespace std; 

int dir[4][2] = { { 0, 1 },{ 0, -1 },{ 1, 0 },{ -1, 0 } };
int table[1000][1000];


 
int main() {
	bool fail = false;
	int M,N, ans=0, max = 0 ;
	cin >> M >> N;
	queue <pair <int, int>> q;
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			scanf("%d", &table[i][j]); 
			if (table[i][j] == 1) q.push(make_pair(i, j));
		} 
	}



	while (!q.empty()) {
		int x = q.front().first;
		int y = q.front().second;
		q.pop(); 
		int value = table[x][y] + 1;
 
		ans++;
		for (int k = 0; k < 4; k++) {
			int dx = x + dir[k][0];
			int dy = y + dir[k][1];

			if (0 <= dx && dx < N && 0 <= dy && dy < M && table[dx][dy] == 0) { 
				if (table[dx][dy] == 0) {
					table[dx][dy] = value;
					max=(max < value) ? value : max; 
					q.push(make_pair(dx, dy));
				}
			}
		}


		
	} 

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {

			if (table[i][j] == 0) {
				fail = true;
				break;
			}
		}
	}

	printf("%d\n", (fail)? -1:max-1);
 }
