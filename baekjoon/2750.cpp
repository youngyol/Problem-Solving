// https://www.acmicpc.net/problem/2750

#include <cstdio>
#include <algorithm>
using namespace std;
int a[1000001];
int main() {
    int n;
    scanf("%d",&n);
    for (int i=0; i<n; i++) {
        scanf("%d",&a[i]);
    }
    sort(a,a+n);
    for (int i=0; i<n; i++) {
        printf("%d\n",a[i]);
    }
    return 0;
}
