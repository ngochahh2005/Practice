#include <bits/stdc++.h>
using namespace std;

struct ck {
    int d, g;

    ck (int d, int g) : d(d), g(g) {}
};

bool cmp(ck a, ck b) {
    if (a.g > b.g) return 0;
    else if (a.g == b.g) {
        if (a.d > b.d) return 0;
    }
    return 1;
}

bool cmp1(ck a, ck b) {
    return (a.d > b.d) ? 0 : 1; 
}

bool cmp2(ck a, ck b) {
    return (a.d < b.d) ? 0 : 1;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, k1, k2, t = 1, tmp;
    while (true) {
        cin >> n >> k1 >> k2;
        vector<ck> a;
        if (n == 0 && k1 == 0 && k2 == 0) break;
        for (int i = 0; i < n; i++) {
            cin >> tmp;
            a.emplace_back(i + 1, tmp);
        }

        sort(a.begin(), a.end(), cmp);
        sort(a.begin(), a.begin() + k1, cmp1);
        sort(a.begin() + (n-k2), a.end(), cmp2);

        cout << "Case " << t++ << "\n";
        for (int i = 0; i < k1; i++) {
            cout << a[i].d << " ";
        }
        cout << "\n";
        for (int i = n-k2; i < n; i++) {
            cout << a[i].d << " ";
        }
        cout << "\n";
    }
}

//https://www.spoj.com/PTIT/problems/PTIT123C/