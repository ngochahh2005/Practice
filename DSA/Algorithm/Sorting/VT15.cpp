#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, tmp;
    cin >> n;
    vector<int> a;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        a.emplace_back(tmp);
    }
    sort(a.begin(), a.end());
    cout << max((long long)a[0] * a[1] * a[n-1], (long long)a[n-1] * a[n-2] * a[n-3]);
}

//https://luyencode.net/problem/vt15