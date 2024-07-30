#include <bits/stdc++.h>
using namespace std;

struct data{
    int n, idx;
    string s;
};

bool cmp(data a, data b) {
    if (a.n == b.n) return a.idx < b.idx;
    return a.n < b.n;
}

data a[1000000];

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a[i].n >> a[i].s;
        a[i].idx = i;
        if (i < n/2) {
            a[i].s = "-";
        }
    }
    sort(a, a + n, cmp);
    for (int i = 0; i < n; i++) {
        cout << a[i].s << " ";
    }
}

//https://www.hackerrank.com/challenges/countingsort4/problem