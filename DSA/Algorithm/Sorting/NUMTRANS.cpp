#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    string str[n];
    for (int i = 0; i < n; i++) {
        cin >> str[i];
    }
    sort(str, str + n, greater<string>());
    for (int i = 0; i < n; i++) {
        cout << str[i];
    }
}

//https://luyencode.net/problem/numtrans