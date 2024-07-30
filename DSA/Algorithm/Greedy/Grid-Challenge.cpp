#include <bits/stdc++.h>
#define ll long long
#define lmt 105
using namespace std;

string ch[lmt];

bool check(int c, int n) {
    for (int i = 1; i < n; i++) {
        if (ch[i-1][c] > ch[i][c]) {
            // cout << ch[c][i-1] << "     " << ch[c][i] << "\n";
            return false;
        }
    }
    return true;
}

void solve(int n) {
    int l = ch[0].length();
    for (int i = 0; i < l; i++) {
        if (!check(i, n)) {
            cout << "NO\n";
            return ;
        }
    }
    cout << "YES\n";
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        for (int i = 0; i < n; i++) {
            cin >> ch[i];
            sort(ch[i].begin(), ch[i].end());
            // cout << ch[i] << "\n";
        }
        solve(n);
    }
}

//https://www.hackerrank.com/challenges/grid-challenge/problem