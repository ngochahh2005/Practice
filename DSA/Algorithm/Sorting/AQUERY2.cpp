#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int q, k, tmp, b;
    cin >> q;
    vector<int> a;
    for (int i = 0; i < q; i++) {
        cin >> tmp >> b;
        for (int j = 0; j < b; j++) {
            a.emplace_back(tmp);
        }
    }
    cin >> k;
    sort(a.begin(), a.end());
    cout << a[k-1];
}

//https://luyencode.net/problem/aquery2