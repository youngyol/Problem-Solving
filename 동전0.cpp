// https://www.acmicpc.net/problem/11047

#include <iostream>
#include <string> 
#include <deque>
#include <sstream>
#include <vector>
using namespace std;

int main(int argc, char **argv) {
	int n, k;
	vector <int> coin;
	int tmp; 
	int cnt =0;
	
	
	cin >> n >> k ;
	
	if(1> n || n > 10 || 1> k || k > 100000000 )	return 0; 
	
	
	for(int i = 1 ; i<=n ;  i ++ ){
		cin >> tmp;
		
		if( 1> tmp || tmp > 1000000 )return 0; 
	
		if(i > 1  ){
			if(tmp % coin[i-2] != 0 )
			return 0;
		}
		coin.push_back(tmp);
	}	
	
	int size = coin.size();
	int  i = size -1;
	while ( k != 0 ){
	
		if( k >= coin[i]){
		
			cnt +=k / coin[i];
			k = k %coin[i];
		}
		i--;
	
	}
	
	cout << cnt ;
}
