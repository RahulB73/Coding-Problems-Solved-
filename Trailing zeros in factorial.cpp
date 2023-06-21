// Trailing zeros in factorial

// #include<iostream>
// using namespace std;

// int main(){
//     int num, count = 0,rem;
//     cin>>num;
//     int fact = 1;
//     for(int i=1;i<=num;i++){
//         fact = fact * i;
//     }
//     int n = fact;
    
//     while(n != 0){
//          rem = n%10;
//     if(rem == 0){
//         count ++ ;
//     }
//     else if(rem != 0){
//         break; 
//     }
//     n = n/10;
//     }
//     cout << count;
// }


// C++ program to count
// trailing 0s in n!
#include <iostream>
using namespace std;
 
// Function to return trailing
// 0s in factorial of n
int findTrailingZeros(int n)
{
    if (n < 0) // Negative Number Edge Case
        return -1;
 
    // Initialize result
    int count = 0;
 
    // Keep dividing n by powers of
    // 5 and update count
    for (int i = 5; n / i >= 1; i *= 5)
        count += n / i;
 
    return count;
}
 
// Driver Code
int main()
{
    int n = 4;
    cout << "Count of trailing 0s in " << 100 << "! is "
         << findTrailingZeros(n);
    return 0;
}

