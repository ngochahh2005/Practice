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
    int m1 = 0, m2 = 0, p = -1;
    sort(a.begin(), a.end(), greater<int>());
    for (int i = 1; i < n; i++) {
        if (m1 != 0) {
            if (a[i] == m1 && p == i-1) continue;
            if (a[i-1] == a[i]) m2 = a[i];
        }
        if (a[i-1] == a[i] && m1 == 0) {
            m1 = a[i];
            p = i;
        } 
        if (m1 != 0 && m2 != 0) break;
    }
    cout << (long long)m1 * m2;
}

//https://luyencode.net/problem/mkrect