// https://www.acmicpc.net/problem/1476

#include "string"
#include <iostream>
#include <stdio.h>

using namespace std;

int main() {
	int e,s,m;
	int cnt = 1;
	scanf("%d%d%d", &e, &s, &m);
		
	int E = 1, S = 1, M = 1;
	while(true) {
		if (E == e && S== s && M == m) break;
		E++; S++; M++;
		
		if (E > 15) E = 1;
		if (S > 28) S = 1; 
		if (M > 19) M = 1;
		cnt++;
		
	}
	
	printf("%d", cnt);

}
