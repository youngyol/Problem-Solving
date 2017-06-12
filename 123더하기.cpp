// https://www.acmicpc.net/problem/9095

#include <iostream>
#include <string> 
#include <deque>
#include <algorithm>
#include <sstream>
#include <vector>
using namespace std;

int main(int argc, char **argv) {
	int n;
	vector <int> coin;
	int tmp; 
	int res = 0 ;
	int fn = 0; 
	
	cin >> n ;
	
	coin.push_back(1);
	coin.push_back(2);
	coin.push_back(4);

	for(int i = 4 ; i <= 11; i ++ ){
		res = coin[i-2] + coin[i-3] + coin[i-4];
		coin.push_back(res);
		res = 0;
	}
	
	for (int i = 0 ; i < n ; i ++){
		cin >> tmp;
		if( tmp > 10 || tmp < 1)
			return 0;
		cout<< coin[tmp-1] <<endl;
	}	
}
