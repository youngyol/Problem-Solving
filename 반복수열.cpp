// https://www.acmicpc.net/problem/2331


#include <iostream>
#include <math.h>  
using namespace std;

int check[1000000] = { 0, };

int makeNum(int num, int P) {
	int sum = 0;
	while (num > 0) {
		int tmp = num % 10;
		num /= 10;
		sum += (int)pow(tmp, P);
	
	}
	return sum;
}

int checkDup(int num, int P, int cnt) {
	if (check[num] != 0) {
		return check[num] - 1;
	}
	check[num] = cnt;
	int nextNum = makeNum(num, P); 
	return	checkDup(nextNum, P, cnt + 1);
	
}

int main() {
	int A, P;
	cin >> A >> P;

	cout << checkDup(A, P, 1) << endl;

	return 0;
}
