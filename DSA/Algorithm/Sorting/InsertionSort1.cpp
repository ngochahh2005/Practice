#include <bits/stdc++.h>
using namespace std;

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int i = 0; i < n; i++) {
        bool check = true;
        for (int j = 0; j < n; j++) {
            cout << a[j] << " ";
            if (a[j] > a[j+1]) {
                swap(a[j], a[j+1]);
                check = false;
            }
        }
        if (check == true) break;
        cout << "\n";
    }
}

//https://www.hackerrank.com/challenges/insertionsort1