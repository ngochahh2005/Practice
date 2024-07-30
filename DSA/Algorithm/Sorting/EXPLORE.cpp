#include <bits/stdc++.h>
using namespace std;

struct data {
    int vl;
    bool sg;
};

bool cmp(data a, data b) {
    return a.vl < b.vl;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t, n;
    cin >> t >> n;
    int tmp;
    data a[n + 5];
    a[0].vl = 0;
    a[0].sg = true;
    for (int i = 1; i <= n; i++) {
        cin >> tmp;
        if (tmp < 0) {
            a[i].vl = -tmp;
            a[i].sg = false;
        } else {
            a[i].vl = tmp;
            a[i].sg = true;
        }
    }
    sort(a+1, a+n+1, cmp);
    int i = 1, cnt = 0, x = 0, s = 0;
    while (s <= t && i <= n) {
        if ((a[i].sg == false && a[i-1].sg == false) || (a[i].sg == true && a[i-1].sg == true)) {
            x = a[i].vl - a[i-1].vl;
        } else {
            x = a[i].vl + a[i-1].vl;
        }
        s += x;
        if (s > t) break;
        cnt++;
        i++;
    }
    cout << cnt;
}

//https://luyencode.net/problem/explore