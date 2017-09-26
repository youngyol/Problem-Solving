// https://www.acmicpc.net/problem/2875

#include <iostream>
using namespace std;




int main() {
	int N, M, K;
	cin >> N >> M >> K;
	int maxTeam = 0; 
	
	while (N >= 2 && M >= 1 && M + N >= K + 3) {
			maxTeam++;
			M -= 1;
			N -= 2;
		} 
	
	cout << maxTeam;
		
}
