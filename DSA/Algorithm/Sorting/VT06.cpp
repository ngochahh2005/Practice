#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, tmp, cnt = 0;
    double avg = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        if (tmp % 2 != 0) {
            avg += tmp;
            cnt++;
        }
    }
    cout << setprecision(4) << fixed << (double)avg/cnt;
}

//https://luyencode.net/problem/vt06