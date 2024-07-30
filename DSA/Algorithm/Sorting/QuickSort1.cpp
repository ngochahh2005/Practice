#include <bits/stdc++.h>
using namespace std;

void partition(vector<int> a) {
    vector<int> l, r;
    int key = a[0], n = a.size();
    for (int i = 1; i < n; i++) {
        if (a[i] <= key) l.emplace_back(a[i]);
        else r.emplace_back(a[i]);
    }
    n = l.size();
    if (n == 0) cout << key;
    for (int i = 0; i < n; i++) {
        cout << l[i] << " ";
    }
    if (n != 0) cout << key;
    for (int i = 0; i < r.size(); i++) {
        cout << " " << r[i];
    }
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    vector<int> a;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int tmp;
        cin >> tmp;
        a.emplace_back(tmp);
    }
    partition(a);
}

//https://www.hackerrank.com/challenges/quicksort1/problem