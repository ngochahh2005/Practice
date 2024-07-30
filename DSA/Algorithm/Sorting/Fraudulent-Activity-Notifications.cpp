#include <bits/stdc++.h>
#define ll long long
#define lmt 200005
using namespace std;

int a[lmt], dd[205];

int median(int d) {
    int cnt = 0, mid = (d+1)/2;
    for (int i = 0; i <= 200; i++) {
        if (dd[i] != 0) cnt += dd[i];
        if (cnt >= mid) {
            if (d % 2 == 1 || cnt > mid) return i * 2;
            for (int j = i+1; j <= 200; j++) {
                if (dd[j] > 0) return i+j;
            }
        } 
    }
    return 0;
}

int main() {
    std::ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, d, cnt = 0;
    cin >> n >> d;
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int i = 0; i < n; i++) {
        if (i < d) dd[a[i]]++;
        else {
            if (a[i] >= median(d)) cnt++;
            dd[a[i]]++;
            dd[a[i-d]]--;
        }
    }
    cout << cnt;
}

//https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem