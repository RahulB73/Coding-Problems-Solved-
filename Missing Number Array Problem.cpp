// Missing Number Array Problem
// Approch 1 - Using Sumation Method
// Approch 2 - Using X-OR Method
// Approch 3 - Hashmap Method


#include <bits/stdc++.h>
using namespace std;

class Solution{
  public:
    int missingNumber(vector<int>& array, int n) {
        // Your code goes here
        int b = 0;
        int a = 0;
 
        for (int i = 0; i < n-1; i++)
            a = a ^ array[i];
     
        for (int i = 1; i <= n; i++)
            b = b ^ i;
     
        return (a ^ b);
    }
};

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;

        vector<int> array(n - 1);
        for (int i = 0; i < n - 1; ++i) cin >> array[i];
        Solution obj;
        cout << obj.missingNumber(array, n) << "\n";
    }
    return 0;
}