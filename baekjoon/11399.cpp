// https://www.acmicpc.net/problem/11399

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
	
	if(1> n || n > 1000 )	return 0; 
	
	
	for(int i = 1 ; i<=n ;  i ++ ){
		cin >> tmp;
		if( 1> tmp || tmp > 1000 )return 0; 
		coin.push_back(tmp);
	}	
	
	
	sort(coin.begin(), coin.end());
	
	int size = coin.size();
	for( int i = 0; i < size ; i ++){
		if(i == 0)
			res += coin[i];
		else{
			res = res + coin[i];			
		}
		fn += res;
	}
	cout << fn;
	
}
