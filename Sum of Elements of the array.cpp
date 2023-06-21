//Sum of Elements of the array

#include<iostream>
using namespace std;

int simpleArraySum(long arr[], long n) {
   int sum = 0;
   for(int i=0; i<n; i++)
   {
       sum += arr[i];
   }
   return sum;
}

int main(){
    long n;
    cin>>n;
    
    long arr[n];
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    
    cout<<simpleArraySum(arr,n);
}