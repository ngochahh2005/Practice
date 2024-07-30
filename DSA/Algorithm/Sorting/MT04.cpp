#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, m, h;
    cin >> m >> n >> h;
    h--;
    int a[n+5][m+5];
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cin >> a[i][j];
        }   
    }
    sort(a[h], a[h] + n);
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cout << a[i][j] << " ";
        }   
        cout << "\n";
    }
}

//https://luyencode.net/problem/mt04