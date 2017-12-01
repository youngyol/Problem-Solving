// https://www.acmicpc.net/problem/2748

#include <iostream>

using namespace std;
 
int main() {
	int  N;
	long long a[1000];
	cin >> N;  

	a[0] = 0;
	a[1] = 1;

	for (int i = 2; i <= N; i++) {
		a[i] = a[i - 1] + a[i - 2];
	}
	printf("%lld\n",a[N]);
	 
}
