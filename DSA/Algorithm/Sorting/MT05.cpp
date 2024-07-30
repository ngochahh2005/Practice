#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int m, n, c;
    cin >> m >> n >> c;
    c--;
    int a[m][n];
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cin >> a[i][j];
        }
    }
    int b[m];
    for (int i = 0; i < m; i++) {
        b[i] = a[i][c];
    }
    sort(b, b + m);
    for (int i = 0; i < m; i++) {
        a[i][c] = b[i];
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cout << a[i][j] << " ";
        }
        cout << "\n";
    }
}

//https://luyencode.net/problem/mt05