#include <bits/stdc++.h>
#define ll long long
#define lmt 200005
using namespace std;

int n, a[lmt];
ll bit[lmt];

void update(int idx, int val) {
    while (idx <= n) {
        bit[idx] += val;
        idx += idx & -idx;
    }
}

void updateRange(int l, int r, int val) {
    update(l, val);
    update(r+1, -val);
}

ll getS(int idx) {
    ll res = 0;
    while (idx > 0) {
        res += bit[idx];
        idx -= idx & -idx;
    }
    return res;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int q;
    cin >> n >> q;
    for (int i = 1; i <= n; i++) {
        cin >> a[i];
        update(i, a[i] - a[i-1]);
    }
    while (q--) {
        int ok;
        cin >> ok;
        if (ok == 1) {
            int l, r, u;
            cin >> l >> r >> u;
            updateRange(l, r, u);
        } else {
            int k;
            cin >> k;
            cout << getS(k) << "\n";
        }
    }
}

//https://lqdoj.edu.vn/problem/cses1651
