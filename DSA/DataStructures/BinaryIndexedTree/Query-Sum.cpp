#include <bits/stdc++.h>
#define ll long long
#define lmt 100005
using namespace std;

int a[lmt], n;
ll bit[lmt];

void update(int u, int v) {
    while (u <= n) {
        bit[u] += v;
        u += u & (-u);
    }
}

ll  getSum(int p) {
    ll res = 0;
    while (p > 0) {
        res += bit[p];
        p -= p & (-p);
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
        update(i, a[i]);
    }
    int type,u, v, p, x;
    while (q--) {
        cin >> type;
        if (type == 1) {
            cin >> p >> x;
            update(p, x);
        } else {
            cin >> u >> v;
            cout << getSum(v) - getSum(u-1) << "\n";
        }
    }
}

//https://lqdoj.edu.vn/problem/querysum