#include <bits/stdc++.h>
#define ll long long
#define lmt 100005
using namespace std;

int a[lmt], n;
ll bit[lmt];

void update(int idx, int val) {
    while (idx <= n) {
        bit[idx] += val;
        idx += idx & -idx;
    }
}

ll getSum(int idx) {
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
    cin >> q; 
    while (q--) {
        vector<int> v;
        cin >> n;
        fill(bit, bit+n+1, 0);
        for (int i = 1; i <= n; i++) {
            cin >> a[i];
            v.emplace_back(a[i]);
        }

        sort(v.begin(), v.end());
        v.resize(unique(v.begin(), v.end()) - v.begin());
        for (int i = 1; i <= n; i++) {
            a[i] = lower_bound(v.begin(), v.end(), a[i]) - v.begin() + 1;
        }

        ll res = 0;
        for (int i = n; i >= 1; i--) {
            res += getSum(a[i] - 1);
            update(a[i], 1);
        }
        cout << res << "\n";
    }
}

//https://www.hackerrank.com/challenges/insertion-sort/problem