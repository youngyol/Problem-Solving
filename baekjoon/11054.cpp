// https://www.acmicpc.net/problem/11054

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int id[1001];
int dd[1001];
int main() {
	int n;
	cin >> n;
	vector<int> v(n);
	for (int i = 0; i<n; i++) {
		cin >> v[i];
	}
	for (int i = 0; i<n; i++) {
		id[i] = 1;
		for (int j = 0; j<=i; j++) {
			if (v[i]>v[j] && id[i] < id[j] + 1) {
				id[i] = id[j] + 1;
			}
		}
		dd[n - i - 1] = 1;
		for (int k = n - 1; k >= n - i - 1; k--) {
			if (v[n - i - 1] > v[k] && dd[n - i - 1] < dd[k] + 1) {
				dd[n - i - 1] = dd[k] + 1;
			}
		}
	}
	int sum=0;
	for (int i = 0; i<n; i++) {
		sum = max(sum, id[i] + dd[i]);
	}
	cout << sum - 1;
}
