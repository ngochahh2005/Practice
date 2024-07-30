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
    cout << a[n-1] - a[0];
}

//https://luyencode.net/problem/vt12