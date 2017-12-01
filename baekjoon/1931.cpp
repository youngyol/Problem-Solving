 // https://www.acmicpc.net/problem/1931
 
 
#include <algorithm>
#include <vector>  
#include <iostream>

using namespace std;


int main() {
	vector <pair <int, int>> sol;
		
	int  cnt, answer = 0;
	cin >> cnt;

	while (cnt-- > 0) {
		pair <int, int> tmp;
		scanf("%d %d", &tmp.second, &tmp.first);
		sol.push_back(tmp);	  
		
	}

	sort(sol.begin() , sol.end());

	int size = sol.size();
	pair<int, int> compare = sol[0];
	answer++;
	for (int i = 1; i < size; i++) { 
		if (compare.first > sol[i].second) continue;
		else {
			compare = sol[i];
			answer++;
		}
	}
	cout << answer << endl; 
}
