#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, tmp;
    cin >> n;
    unordered_map<int, int> a;
    vector<int> idx;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        if (a.find(tmp) == a.end()) idx.emplace_back(tmp);
        a[tmp]++;
    }
    cout << idx.size() << "\n";
    for (int x : idx) {
        cout << x << " " << a[x] << "\n";
    }
}

//https://luyencode.net/problem/mtfreq