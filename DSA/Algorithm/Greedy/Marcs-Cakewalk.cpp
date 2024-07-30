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
    int c[n];
    for (int i = 0; i < n; i++) {
        cin >> c[i];
    }
    sort(c, c+n, greater<int>());
    ll res = 0;
    for (int i = 0; i < n; i++) {
        res += (ll)pow(2, i) * c[i];
    }
    cout << res;
}

//https://www.hackerrank.com/challenges/marcs-cakewalk/problem