// https://www.acmicpc.net/problem/14656

#include <iostream>

using namespace std;
 
int main() {
	int N , cnt =0;
	cin >> N;  
	
	for (int i = 1; i <= N; i++) {
		int cmp;
		cin >> cmp;
		if (cmp != i)cnt++;
	}
	printf("%d\n", cnt);
	 
}
