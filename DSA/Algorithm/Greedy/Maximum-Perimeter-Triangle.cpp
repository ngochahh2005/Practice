#include <bits/stdc++.h>
#define ll long long
#define lmt 100005
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    sort(a, a+n);
    int c1 = -1, c2 = -1, c3 = -1;
    ll cv = 0, ma = 0;
    for (int i = 0; i < n-2; i++) {
        for (int j = i+1; j < n-1; j++) {
            int pos = lower_bound(a+j+1, a+n, a[i] + a[j]) - a;
            if (pos - 1 == j) continue;
            cv = (ll)a[i] + a[j] + a[pos - 1]; 
            if (ma < cv) {
                ma = cv;
                c1 = a[i];
                c2 = a[j];
                c3 = a[pos - 1];
            }
        }
    }
    if (ma == 0) cout << "-1"; 
    else cout << c1 << " " << c2 << " " << c3;
}

//https://www.hackerrank.com/challenges/maximum-perimeter-triangle/problem