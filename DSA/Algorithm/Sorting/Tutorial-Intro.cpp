#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, v;
    cin >> v >> n;
    int a[n];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    cout << lower_bound(a, a + n, v) - a;
}

//https://www.hackerrank.com/challenges/tutorial-intro/problem