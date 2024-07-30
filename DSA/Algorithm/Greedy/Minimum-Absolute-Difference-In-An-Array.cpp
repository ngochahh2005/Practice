#include <bits/stdc++.h>
#define ll long long
#define lmt 100005
using namespace std;

int a[lmt];

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    sort(a, a + n);
    int mi = a[1] - a[0];
    for (int i = 2; i < n; i++) {
        mi = min(mi, a[i] - a[i-1]);
    }
    cout << mi;
}

//https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem