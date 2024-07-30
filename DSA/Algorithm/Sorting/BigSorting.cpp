#include <bits/stdc++.h>
using namespace std;

bool cmp(string a, string b) {
    if (a.length() == b.length()) return a < b;
    return a.length() < b.length();
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    string s[n];
    for (int i = 0; i < n; i++) {
        cin >> s[i];
    }
    sort(s, s+n, cmp);
    for (int i = 0; i < n; i++) {
        cout << s[i] << "\n";
    }
}

//https://www.hackerrank.com/challenges/big-sorting/problem