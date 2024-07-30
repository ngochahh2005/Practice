#include <bits/stdc++.h>
#define ll long long
#define lmt 100005
using namespace std;

int a[lmt], n;
ll bit1[lmt], bit2[lmt]; 

void update(ll bit[], int idx, ll val) {
    while (idx <= n) {
        bit[idx] += val;
        idx += idx & -idx;
    }
}

void updateRange(int l, int r, int x) {
    update(bit1, l, (ll)(n-l+1) * x);
    update(bit1, r + 1, (ll)-(n-r) * x);
    update(bit2, l, x);
    update(bit2, r + 1, -x);
}

ll getSum(ll bit[], int idx) {
    ll sum = 0;
    while (idx > 0) {
        sum += bit[idx];
        idx -= idx & -idx;
    }
    return sum;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);

    int q;
    cin >> n >> q;
    for (int i = 1; i <= n; i++) {
        cin >> a[i];
        update(bit2, i, a[i] - a[i-1]);
        update(bit1, i, (ll)(n-i+1) * (a[i] - a[i-1]));
    }
    
    while (q--) {
        int type;
        cin >> type;
        if (type == 1) {
            int u, v, x;
            cin >> u >> v >> x;
            updateRange(u, v, x);
        } else {
            int l, r;
            cin >> l >> r;
            ll pre1 = getSum(bit1, l-1) - getSum(bit2, l-1) * (n-l+1);
            ll pre2 = getSum(bit1, r) - getSum(bit2, r) * (n-r);
            cout << pre2 - pre1 << "\n";
        }
    }

    return 0;
}

//https://lqdoj.edu.vn/problem/querysum2