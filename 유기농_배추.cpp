// https://www.acmicpc.net/problem/1012

#include <iostream> 
#include <vector>
#include <stack>
using namespace std; 
 

vector <vector<int>> table;
vector <int> one;
stack<pair<int,int>> st;
vector <int> result;
int dir[4][2] = { { 0, 1 },{ 0, -1 },{ 1, 0 },{ -1, 0 } };


int main() { 
	int a, b;
	int ans = 0; 
	int countTestCase = 0;
	int m, n, cnt;
	cin >> countTestCase;
	int x, y;
	for (int ct = 0; ct < countTestCase; ct++)
	{
		//init 
		if (ct != 0) {
			ans = 0;
			table.clear();
			one.clear();
		}
		cin >> m >> n >> cnt;

		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n; y++) {
				one.push_back(0);
			}
			table.push_back(one);
			one.clear();
		}

		for (int i = 0; i < cnt; i++) {
			cin >> a >> b;
			table[a][b] = 1;
		}


		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (table[i][j] == 1) {
					st.push(pair<int, int>(i, j));
					table[i][j] = 0;

					while (!st.empty()) {
						pair <int, int> p = st.top();
						st.pop();
						x = p.first;
						y = p.second;
						for (int k = 0; k < 4; k++) {
							int dx = x + dir[k][0];
							int dy = y + dir[k][1];

							if (dx >= m || dx < 0 || dy >= n || dy < 0)
								continue;
							if (table[dx][dy] == 1) {
								st.push(pair<int, int>(dx, dy));
								table[dx][dy] = 0;
							}
						}
					}

					ans++;
				}

			}
		}

		result.push_back(ans);


	}
	for (int i = 0; i < result.size(); i ++)
		printf("%d\n", result[i]);
	 
	 

}
