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
    int cnt = 1, ma = 1, val = h[0];
    sort(h, h + n);
    for (int i = 0; i < n-1; i++) {
        if (h[i] != h[i+1]) {
            if (cnt >= ma) {
                ma = cnt;
                val = h[i];
            }
            cnt = 1;
        } else cnt++;
    }
    if (cnt >= ma) {
        ma = cnt;
        val = h[n-1];
    }
    cout << val << " " << ma;
}

//https://luyencode.net/problem/tnv