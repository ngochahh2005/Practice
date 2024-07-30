#include <bits/stdc++.h>
#define ll long long
#define lmt 100005
using namespace std;

int a[lmt];
ll c[lmt];

ll solve(int n) {
    ll res = 0;
    int cnt = 1;
    for (int i = 1; i <= n; i++) {
        if (a[i-1] >= a[i] && a[i] <= a[i+1]) c[i] = 1;
    }
    for (int i = 1; i <= n; i++) {
        if (a[i-1] < a[i] && a[i] <= a[i+1]) c[i] = c[i-1] + 1;
    }
    for (int i = n; i > 0; i--) {
        if (a[i-1] >= a[i] && a[i] > a[i+1]) c[i] = c[i+1] + 1;
    }
    for (int i = 1; i <= n; i++) {
        if (a[i-1] < a[i] && a[i] > a[i+1]) c[i] = max(c[i-1], c[i+1]) + 1;
    }
    for (int i = 1; i <= n; i++) {
        res += c[i];
    }
    return res;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++) {
        cin >> a[i];
    }
    
    cout << solve(n);
}

//https://www.hackerrank.com/challenges/candies/problem