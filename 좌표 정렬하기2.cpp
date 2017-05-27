// https://www.acmicpc.net/problem/11651

#include <cstdio>
#include <vector>
#include <algorithm>
using namespace std;
int main() {
    int n;
    scanf("%d",&n);
    vector<pair<int,int>> a(n); 
    for (int i=0; i<n; i++) {
        scanf("%d %d", &a[i].second,&a[i].first);
    }
    
    sort(a.begin(),a.end());
    for (int i=0; i<a.size(); i++) {
        printf("%d %d\n", a[i].second,a[i].first);
    }
    return 0;
}
