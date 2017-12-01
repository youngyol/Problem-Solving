// https://www.acmicpc.net/problem/1463

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector <int> dp;

int main() {
	int N;
	dp.push_back(0);
	dp.push_back(0);
	dp.push_back(1);
	dp.push_back(1);
	
	cin >> N;
	int start = 4;
	while (N >= start) { 
		int tmp;
		if (start % 3 == 0 && start % 2 == 0) {
			tmp = min(min(dp[start/3]+1, dp[start / 2] + 1), dp[start -1] + 1);
		}
		else if (start % 3 == 0) {
			tmp = min(dp[start / 3] + 1, dp[start - 1] + 1);
		}
		else if (start % 2 == 0) {
			tmp = min( dp[start / 2] + 1, dp[start - 1] + 1);
		}
		else {
			tmp = dp[start - 1] + 1;
		}

		dp.push_back(tmp);
		start++;
	} 
	cout << dp[N] <<endl;
}
