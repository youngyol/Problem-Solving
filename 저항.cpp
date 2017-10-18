// https://www.acmicpc.net/problem/1076

#include <cstdio>
#include <iostream>
#include <algorithm>
#include <string>
#include <map>
#include <bitset>

using namespace std;

int main()
{
	map<string, int>color = { 
    {"black",0},{"brown",1},{"red",2} ,{"orange",3},{"yellow",4},
    {"green",5},{"blue",6},{"violet",7},{"grey",8},{"white",9}
  };
  
	int num = 3, sum = 0, ten  = 0;
  
	while (num> 0) {
		string tmp;
		cin >> tmp;
		int delimeter;
		switch (num) {
		case 3:
			sum += color[tmp] * 10;
			break;
		case 2:
			sum += color[tmp];
			break;
		default :
			ten = color[tmp];
			break;
		}
		--num;
	}

	cout << sum; 

	if(sum!=0)
		for (int i = 0; i < ten; i++)
			cout << "0";
	cout << "\n";
}
