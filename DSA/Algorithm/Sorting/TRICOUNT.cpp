#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    sort(a, a + n);
    long long cnt = 0, pos;
    for (int i = 0; i < n - 2; i++) {
        for (int j = i + 1; j < n - 1; j++) {
            pos = lower_bound(a + j + 1, a + n, a[i] + a[j]) - a;
            cnt += pos - j - 1;
        }
    }
    cout << cnt;
}

//https://luyencode.net/problem/tricount