// https://www.acmicpc.net/problem/10871

#include <cstdio>
#include <iostream>


using namespace std;

int main()
{
	int N, X;
	cin >> N >> X;

	auto isLessX = [&X](int num) {
		return num < X;
	};

	for (int i = 0; i < N; i++){
		int num;
		scanf("%d", &num);
		if (isLessX(num)) printf("%d ", num);
	}
	 
}
