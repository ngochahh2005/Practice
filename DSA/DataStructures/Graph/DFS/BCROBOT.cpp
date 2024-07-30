#include <bits/stdc++.h>
#define MAX 1000
#define ll long long
const ll mod = 2147483647;
using namespace std;

ll dp[MAX+5][MAX+5];
int dd[MAX+5][MAX+5];
int a[MAX+5][MAX+5];
string str[MAX+5];
int n;
int dx[] = {1, 0, -1, 0};
int dy[] = {0, 1, 0, -1};

void qhd(int x, int y) {
    dp[x][y] = 1;
    for (int i = x; i <= n; i++) {
        for (int j = y; j <= n; j++) {
            if (a[i][j] == 1) {
                if (i > 1) dp[i][j] = (dp[i][j] % mod + dp[i-1][j] % mod) % mod;
                if (j > 1) dp[i][j] = (dp[i][j] % mod + dp[i][j-1] % mod) % mod;
            }
        }
    }
}

bool isValid(int x, int y) {
    return (x >= 0 && x < n && y >= 0 && y < n && str[x][y] == '.' && dd[x][y] == 0);
}

bool dfs(int x, int y) {
    if (x == n-1 && y == n-1) return true;
    dd[x][y] = 1;
    for (int i = 0; i < 4; i++) {
        int a = x + dx[i];
        int b = y + dy[i];
        if (isValid(a, b)) {
            if (dfs(a, b)) return true;
        }
    }
    return false;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> str[i];
        for (int j = 1; j <= n; j++) {
            if (str[i][j-1] == '.') a[i+1][j] = 1;
            else a[i+1][j] = 0;
        }
    }
    qhd(1, 1);
    if (dp[n][n] != 0) cout << dp[n][n];
    else {
        if (dfs(0, 0)) cout << "THE GAME IS A LIE";
        else cout << "INCONCEIVABLE";
    }
}

//https://www.spoj.com/PTIT/problems/BCROBOT/