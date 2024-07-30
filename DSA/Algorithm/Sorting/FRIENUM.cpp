#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    unordered_map<int, int> mp;
    int n, tmp;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        mp[tmp]++;
    }
    int cnt = 0;
    for (auto x : mp) {
        if (x.second > 1) {
            cnt += x.second;
        }
    }
    cout << cnt;
}

//https://luyencode.net/problem/frienum