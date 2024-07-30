#include <bits/stdc++.h>
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
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }
}

//https://www.hackerrank.com/challenges/correctness-invariant