// https://www.acmicpc.net/problem/11728

#include <iostream>
int a[1000000];
int b[1000000];
int result[1000000];


int main() {
    int n,m;
    scanf("%d %d",&n,&m);
    
    for (int i=0; i<n; i++) scanf("%d",&a[i]);
    for (int i=0; i<m; i++) scanf("%d",&b[i]);
    
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < n || j < m) {
        if (j >= m || (i < n && a[i] <= b[j])) {
            result[k++] = a[i++];
        } else {
            result[k++] = b[j++];
        }
    }
    for (int i=0; i<k; i++) {
        printf("%d ",result[i]);
    }

}
