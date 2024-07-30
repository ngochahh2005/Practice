#include <bits/stdc++.h>
using namespace std;

int a[105];

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int tmp;
        cin >> tmp;
        a[tmp]++;
    }
    for (int i = 0; i < 100; i++) {
        cout << a[i] << " ";
    }
}

//https://www.hackerrank.com/challenges/countingsort1/problem