#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    string s;
    cin >> s;
    int m, tmp, l = s.length();
    cin >> m;
    unordered_map<int, int> mp;
    vector<int> key;
    for (int i = 0; i < m; i++) {
        cin >> tmp;
        if (mp.find(tmp) == mp.end()) {
            key.emplace_back(tmp);
        }
        mp[tmp]++;
    }
    for (int i = 0; i < key.size(); i++) {
        if (mp[key[i]] % 2 == 0) continue;
        reverse(s.begin() + key[i] - 1, s.begin() + l - key[i] + 1);
    }
    cout << s;
}

//https://luyencode.net/problem/reverse