// Reversing the number

#include<iostream>
using namespace std;

int main(){
    int num, rem = 0, rev = 0;
    cout<<"Enter the Number : ";
    cin>>num;
    int temp = abs(num); // Take the absolute value of the input
    
    // Reversing the number without using any Data Structure
    while(temp != 0){
        rem = temp % 10;
        rev = (rev * 10) + rem;  
        temp = temp / 10;
    }
    
    if (num < 0) {
        rev = -rev; // If the input was negative, make the reversed number negative as well
    }
    
    cout<<"Reverse of the given number is "<<rev;
}

