#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
	int n;
    cin >> n;
    string s[n+5];
    for (int i = 0; i < n; i++) {
        cin >> s[i];
    }
    bool check = false;
    char w = '.';
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (s[i][j] != '.') {
                if (i > 0) if (s[i][j] == s[i+1][j] && s[i][j] == s[i-1][j]) {
                    w = s[i][j];
                    check = true;
                    break;
                }
                if (j > 0) if (s[i][j] == s[i][j+1] && s[i][j] == s[i][j-1]) {
                    w = s[i][j];
                    check = true;
                    break;
                }
                if (i > 0 && j > 0) {
                    if (s[i][j] == s[i+1][j-1] && s[i][j] == s[i-1][j+1]) {
                        w = s[i][j];
                        check = true;
                        break;
                    }
                    if (s[i][j] == s[i-1][j-1] && s[i][j] == s[i+1][j+1]) {
                        w = s[i][j];
                        check = true;
                        break;
                    }
                }
                // cout << s[i][j];
            }
        }
        // cout << "\n";
        if (check == true) break;
    }
    if (check == false) cout << "ongoing";
    else cout << w;
}

//http://www.spoj.com/PTIT/problems/PTIT125J/