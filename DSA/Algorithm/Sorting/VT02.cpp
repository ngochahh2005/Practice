#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, res, tmp;
    cin >> n;
    vector<int> a;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        a.emplace_back(tmp);
    }
    sort(a.begin(), a.end(), greater<int>());
    int ma = a[0];
    for (int i = 0; i < n; i++) {
        if (a[i] != ma) {
            cout << a[i];
            return 0;
        }
    }
    cout << "NOT FOUND";
}

//https://luyencode.net/problem/vt02