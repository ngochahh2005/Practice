#include <bits/stdc++.h>
#define ll long long
using namespace std;

string add(string s1, string s2) {
    int i = s1.size() - 1, j = s2.size() - 1;
    int nho = 0, s;
    string res;
    while (i >= 0 || j >= 0 || nho > 0) {
        s = nho;
        if (i >= 0) s += s1[i--] - '0';
        if (j >= 0) s += s2[j--] - '0';
        nho = s / 10;
        res.push_back(s % 10 + '0');
    }
    reverse(res.begin(), res.end());
    return res;
}

string mul(string s1, char ch) {
    if (ch == '0') return "0";
    int l1 = s1.size();
    int nho = 0, s = 0, dg = ch - '0';
    string res = "";
    for (int i = l1-1; i >= 0; i--) {
        s = nho + (s1[i] - '0') * dg;
        nho = s / 10;
        res.push_back(s % 10 + '0');
    }
    if (nho > 0) res.push_back(nho + '0');
    reverse(res.begin(), res.end());
    return res;
}

string nhan(string s1, string s2) {
    int l2 = s2.size();
    char dau = '';
    if (s1[0] == '-' && s2[0] == '-') {
        s2.erase(0);
        s1.erase(0);
    } else if (s1[0] == '-') {
        s1.erase(0);
        dau = '-';
    } else if (s2[0] == '-') {
        s2.erase(0);
        dau = '-';
    }
    int nho = 0, s = 0;
    for (int i = l2-1; i >= 0; i--) {
        string tmp = mul(s1, s2[i]);
        for (int j = i+1; j < l2; j++) {
            tmp += "0";
        }

    }
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
	// int m, n;
    // while (true) {
    //     cin >> m >> n;
    //     if (m == 0 && n == 0) break;
    //     ll a[m+5], x;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             cin >> x;
    //             if (i == 0) a[j] = x;
    //             else a[j] *= x;
    //         }
    //     }
    //     ll ma = -1e18;
    //     int pos = 0;
    //     for (int j = 0; j < m; j++) {
    //         if (ma <= a[j]) {
    //             ma = a[j];
    //             pos = j;
    //         }
    //     }
    //     cout << pos + 1 << "\n";
    // }
    cout << mul("48456", '9');
}
