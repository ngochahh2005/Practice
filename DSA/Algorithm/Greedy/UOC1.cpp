#include <bits/stdc++.h>
using namespace std;

void phanTich(int n, vector<int>& a) {
    int can = sqrt(n);
    a.emplace_back(n);
    for (int i = 2; i <= can; i++) {
        if (n % i == 0) {
            if (i * i == n) a.emplace_back(i);
            else {
                a.emplace_back(i);
                a.emplace_back(n/i);
            }
        }
    }
    sort(a.begin(), a.end());
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int a, b;
    cin >> a >> b;
    vector<int> x, y;
    phanTich(a, x);
    phanTich(b, y);
    long long s = 0;
    for (int i = 0; i < x.size(); i++) {
        if (!binary_search(y.begin(), y.end(), x[i])) {
            s += (long long)x[i];
        }
    }
    cout << s;
}

//https://luyencode.net/problem/uoc1