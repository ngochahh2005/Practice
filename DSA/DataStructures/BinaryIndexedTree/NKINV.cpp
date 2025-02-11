#include <bits/stdc++.h>
#define ll long long
#define lmt 60005
using namespace std;

int n;
vector<int> a, v;
vector<ll> bit;

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
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    
    cin >> n;
    a.resize(n + 1);
    bit.assign(n + 1, 0); 

    for (int i = 1; i <= n; i++) {
        cin >> a[i];
        v.push_back(a[i]);
    }

    sort(v.begin(), v.end());
    v.erase(unique(v.begin(), v.end()), v.end());

    for (int i = 1; i <= n; i++) {
        a[i] = lower_bound(v.begin(), v.end(), a[i]) - v.begin() + 1;
    }

    ll res = 0;
    for (int i = n; i >= 1; i--) {
        res += getSum(a[i] - 1);
        update(a[i], 1);
    }

    cout << res << "\n";
    return 0;
}
