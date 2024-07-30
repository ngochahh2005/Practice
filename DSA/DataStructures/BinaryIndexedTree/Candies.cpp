#include <bits/stdc++.h>
#define ll long long
#define lmt 100005
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

ll getSum(int idx) {
    ll res = 0;
    while (idx > 0) {
        res += bit[idx];
        idx -= idx & -idx;
    }
    return res;
}

int chat(int t) {
    int l = 1, r = n, res = -1;
    while (l <= r) {
        int m = (l+r)/2;
        ll tmp = getSum(m);
        if (tmp >= t) {
            res = m;
            r = m-1;
        } else l = m+1;
    }
    return res;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    cin >> n;
    for (int i = 1; i <= n; i++) {
        cin >> a[i];
    }
    sort(a+1, a+n+1);
    for (int i = 1; i <= n; i++) {
        update(i, a[i] - a[i-1]);
    }
    int m;
    cin >> m;
    while (m--) {
        int t;
        cin >> t;
        int j = chat(t);
        if (j != -1) {
            cout << n-j+1 << "\n";
            updateRange(j, n, -1);
        } else cout << "0\n";
    }
}

//https://lqdoj.edu.vn/problem/candies