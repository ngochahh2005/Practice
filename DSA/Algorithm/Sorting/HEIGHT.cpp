#include <bits/stdc++.h>
using namespace std;

struct hocSinh {
    int h, f = 0, idx;
};

bool cmp1(hocSinh a, hocSinh b) {
    return a.h < b.h;
}

bool cmp2(hocSinh a, hocSinh b) {
    return a.idx < b.idx;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    hocSinh a[n];
    for (int i = 0; i < n; i++) {
        cin >> a[i].h;
        a[i].idx = i;
    }
    sort(a, a + n, cmp1);
    int cnt = 1, d = 0;
    for (int i = 1; i < n; i++) {
        if (a[i].h == a[i-1].h) {
            cnt++;
            a[i].f = a[i-1].f;
        } else {
            d += cnt;
            a[i].f = d;
            cnt = 1;
        }
    }
    sort(a, a + n, cmp2);
    for (int i = 0; i < n; i++) {
        cout << a[i].f << " ";
    }
}

//https://luyencode.net/problem/height