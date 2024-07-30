#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    unordered_map<int, int> a;
    int n, tmp;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        a[tmp]++;
    }
    long long cnt = 0;
    for (auto x : a) {
        if (x.second > 1) cnt += (long long)x.second * (x.second - 1) / 2;
    }
    cout << cnt;
}

//https://luyencode.net/problem/scbn2