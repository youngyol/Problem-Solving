// https://www.acmicpc.net/problem/10989

#include <iostream>
#include <vector>

using namespace std;

int cnt[100001] = { 0, };

int main() {
	int N, number;
	cin >> N;
	while (N-- > 0) {
		scanf("%d" ,&number);
		cnt[number]++;
	}

	for (int i = 1; i <= 10000; i++) {
		if (cnt[i] <= 0) continue;
		for (int j = 1; j <= cnt[i]; j++) {
			printf("%d\n", i);
		}
	}
}
