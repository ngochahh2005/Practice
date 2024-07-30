#include <bits/stdc++.h>
using namespace std;

bool check(int n) {
    int can = sqrt(n);
    if (n < 2) return false;
    for (int i = 2; i <= can; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    set<int> a;
    int tmp, n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> tmp;
        if (check(tmp)) a.insert(tmp);
    }
    for (int x : a) {
        cout << x << " ";
    }
}

//https://luyencode.net/problem/vt09