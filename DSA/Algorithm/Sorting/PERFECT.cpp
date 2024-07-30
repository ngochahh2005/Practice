#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    int h[n];
    for (int i = 0; i < n; i++) {
        cin >> h[i];
    }
    sort(h, h + n);
    int mi = h[1] - h[0];
    for (int i = 1; i < n-1; i++) {
        mi = min(mi, h[i+1] - h[i]);
    }
    cout << mi;
}

//https://luyencode.net/problem/perfect