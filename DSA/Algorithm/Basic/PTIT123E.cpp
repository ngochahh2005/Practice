#include <bits/stdc++.h>
using namespace std;

int d1[15], d2[15];

bool check(string s) {
    int l = s.length();
    for (int i = 2; i <= l; i++) {
        int nho = 0;
        for (int j = 0; j < 10; j++) d2[j] = 0;
        for (int j = l-1; j >= 0; j--) {
            int sum = (s[j] - '0') * i + nho;
            d2[sum % 10]++;
            nho = sum / 10;
        }
        if (nho > 0) d2[nho]++;
        for (int j = 0; j < 10; j++) if (d1[j] != d2[j]) return false;
    }
    return true;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    string str;
    while (cin >> str) {
        for (int i = 0; i < 10; i++) d1[i] = 0;
        for (int i = 0; i < str.size(); i++) d1[str[i] - '0']++;
        if (check(str)) cout << str << " is cyclic\n";
        else cout << str << " is not cyclic\n";
    }
}

//http://www.spoj.com/PTIT/problems/PTIT123E/