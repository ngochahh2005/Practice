#include <bits/stdc++.h>
using namespace std;

int a[1000001];

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
    cout << a[n/2];
}

//https://www.hackerrank.com/challenges/find-the-median/problem