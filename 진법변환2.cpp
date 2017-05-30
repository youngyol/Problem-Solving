// https://www.acmicpc.net/problem/11005

#pragma warning(disable:4996)
#include<iostream>
#include<vector>
#include<stdio.h>
#include<string.h>

using namespace std;

char ch[27];

int main()
{
	vector<char> v;
	int n, b, ans = 0;
	cin >> n >> b;
	for (int i = 0; i < 26; i++){
		ch[i] = i + 65;
	}
	while (b <= n){
		int tmp = n%b;
		if (tmp > 9)
			v.push_back((char)ch[tmp - 10]);
		else
			v.push_back((char)tmp + 48);
		n = n / b;
	}
	
	if (n > 9)
		v.push_back((char)ch[n - 10]);
	else
		v.push_back((char)n + 48);
    
	for (auto vit = v.rbegin(); vit != v.rend(); vit++){
		cout << *vit;
	}
	cout << endl;
}
