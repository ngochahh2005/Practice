#include <bits/stdc++.h>
using namespace std;

bool check(int a[], int n) {
    for (int i = 0; i < n-1; i++) {
        if (a[i] - a[i+1] != 0) return false;
    }
    return true;
}

void solve(int a[], int n) {
    int cnt = 0;
    bool kt = false;
    for (int o = 0; o < 1000; o++) {
        if (check(a, n)) {
            kt = true;
            break;
        }
        int nb = a[0];
        for (int i = 0; i < n; i++) {
            if (i == n-1) a[i] = abs(a[i] - nb);
            else a[i] = abs(a[i] - a[i+1]);
        }
        cnt++;
    }
    if (kt == true) cout << cnt << " iterations\n";
    else cout << "not attained\n";
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
	int n, d = 1;
    while (true) {
        cin >> n;
        if (n == 0) break;
        int a[n+5];
        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }
        cout << "Case " << d++ << ": ";
        solve(a, n);
    }
}

//http://www.spoj.com/PTIT/problems/PTIT123B/