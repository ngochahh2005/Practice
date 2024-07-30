#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, k;
    cin >> n >> k;
    int a[n];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    sort(a, a+n, greater<int>());
    int d = (int)ceil((double)n/k);
    long long cnt = 0;
    for (int i = 0; i < d; i++) {
        cnt += (a[i*k] - 1) * 2;
    }
    cout << cnt;
}

//https://luyencode.net/problem/elevator