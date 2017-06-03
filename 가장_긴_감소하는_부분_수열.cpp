// https://www.acmicpc.net/problem/11722

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
	
	vector <int> result;
	
	int tmp; 
	int res = 0 ;
	int fn = 0; 
	
	
	cin >> n ;
	if( n < 1 || n > 1000)	return 0;
		for(int i =0 ; i < n ; i ++ ){
		coin.push_back(0);
	}
	for(int i =n-1 ; i >=0 ; i --){
		cin >> tmp;
		if( tmp < 1 || tmp > 1000)	return 0;
		coin[i] = tmp;
		
	}
		
	
	int size = coin.size();
	for(int i = 0 ; i < size ; i ++ ){
		result.push_back(1);
		for(int j = 0; j <i; j ++){
			if(coin[j] <coin[i] && result[i] < result[j] + 1)
				result[i] = result[j] + 1;			
		}
	}
	int max=0;
	size = result.size();
	for(int i = 0 ; i < size ; i ++ ){
		if(max < result[i]) max = result[i];
	}
			
	cout << max;
}
