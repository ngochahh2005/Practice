#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, tmp;
    cin >> n;
    unordered_map<int, int> mp;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        mp[tmp]++;
    }
    long long cnt = 0;
    for (auto x : mp) {
        tmp = x.second;
        if (tmp >= 3 && x.first > 0) {
            cnt += (long long)tmp*(tmp-1)*(tmp-2)/6;
        }
    }
    cout << cnt;
}

//https://luyencode.net/problem/tgd