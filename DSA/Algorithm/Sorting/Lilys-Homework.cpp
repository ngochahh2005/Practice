#include <bits/stdc++.h>
#define ll long long
#define lmt 100005
using namespace std;

int countSwaps(vector<int> a, vector<int> tg) {
    int n = a.size();
    unordered_map<int, int> idx;
    for (int i = 0; i < n; i++) {
        idx[a[i]] = i;
    }
    int swaps = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] != tg[i]) {
            swaps++;
            int tmp = a[i];
            a[i] = a[idx[tg[i]]];
            a[idx[tg[i]]] = tmp;
            idx[tmp] = idx[tg[i]];
        }
    }
    return swaps;
}

int result(vector<int> a) {
    vector<int> v = a;
    sort(v.begin(), v.end());
    vector<int> rv = v;
    reverse(rv.begin(), rv.end());
    return min(countSwaps(a, v), countSwaps(a, rv));
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    vector<int> a;
    for (int i = 0; i < n; i++) {
        int tmp;
        cin >> tmp;
        a.emplace_back(tmp);
    }
    cout << result(a);
}

//https://www.hackerrank.com/challenges/lilys-homework/problem