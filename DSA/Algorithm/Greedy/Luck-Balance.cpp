#include <bits/stdc++.h>
#define ll long long
#define lmt 100005
using namespace std;

struct data {
    int l, t;

    data (int l, int t) : l(l), t(t) {}
};

bool cmp(data a, data b) {
    if (a.t == b.t) {
        if (a.t == 1) return a.l > b.l;
        return a.l < b.l;
    }
    return a.t > b.t;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, k, L, T;
    cin >> n >> k;
    vector<data> v;
    for (int i = 0; i < n; i++) {
        cin >> L >> T;
        v.emplace_back(L, T);
    }
    sort(v.begin(), v.end(), cmp);
    int res = 0;
    for (int i = 0; i < n; i++) {
        if (v[i].t == 0) res += v[i].l;
        else {
            if (k > 0) {
                res += v[i].l;
                k--;
            } else res -= v[i].l;
        }
    }
    cout << res;
}

//https://www.hackerrank.com/challenges/luck-balance/problem