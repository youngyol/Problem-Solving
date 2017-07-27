// https://www.acmicpc.net/problem/1629

#include <iostream> 


using namespace std;  

long long int A, B, C;
int sol( long long int  x,  long long int n) {
	if (n == 0) return  1; 

	if (n % 2 == 1)
		return (x*sol(x, n - 1)) %C;
	else {
		long long temp = sol(x, n / 2);
		return (temp * temp) % C;
	}
	 

 
}
int main() { 

	cin >> A >> B >> C; 


	cout<< sol(A, B) << endl;
	 

}
