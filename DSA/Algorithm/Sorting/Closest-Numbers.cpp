#include <bits/stdc++.h>
using namespace std;

int a[200000];

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    sort(a, a+n);
    int mi = 1e9;
    for (int i = 1; i < n; i++) {
        mi = min(a[i] - a[i-1], mi);
    }
    for (int i = 1; i < n; i++) {
        if (a[i] - a[i-1] == mi) {
            cout << a[i-1] << " " << a[i] << " ";
        }
    }
}

//https://www.hackerrank.com/challenges/closest-numbers/problem