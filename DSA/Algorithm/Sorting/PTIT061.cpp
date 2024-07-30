#include <bits/stdc++.h>
using namespace std;

bool cmp1(string a, string b) {
    if (a.length() == b.length()) return a < b;
    return a.length() < b.length();
}

bool cmp2(string a, string b) {
    if (a.length() == b.length()) return a > b;
    return a.length() > b.length();
}

string solve(string a) {
    if (a[1] == '0') {
        for (int i = 1; i < a.length(); i++) {
            if (a[i] != '0') {
                char ch = a[1];
                a[1] = a[i];
                a[i] = ch;
                break;
            }
        }
    }
    return a;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    string str[n];
    vector<string> neg, pos;
    int c1 = 0, c2 = 0;
    for (int i = 0; i < n; i++) {
        cin >> str[i];
        if (str[i][0] == '-') {
            sort(str[i].begin()+1, str[i].end());
            str[i] = solve(str[i]);
            neg.emplace_back(str[i]);
        } else {
            sort(str[i].begin(), str[i].end(), greater<char>());
            pos.emplace_back(str[i]);
        }
    }
    int l1 = neg.size(), l2 = pos.size();
    sort(neg.begin(), neg.end(), cmp1);
    sort(pos.begin(), pos.end(), cmp2);
    for (int i = 0; i < l2; i++) {
        cout << pos[i] << " ";
    }
    for (int i = 0; i < l1; i++) {
        cout << neg[i] << " ";
    }
}

//https://luyencode.net/problem/ptit061