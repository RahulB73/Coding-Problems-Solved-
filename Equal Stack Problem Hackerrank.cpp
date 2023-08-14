// Equal Stack Problem Hackerrank

#include<iostream>
#include<stack>
using namespace std;

int equalStacks(stack <int> n1, stack <int> n2, stack <int> n3){
    return 12;
}

int main(){
    stack <int> n1;
    stack <int> n2;
    stack <int> n3;
    
    int val;
    
    int h1, h2, h3;
    cin>>h1>>h2>>h3;
    
    for(int i=0; i<h1; i++){
        cin>>val;
        n1.push(val);
    }
    
    for(int i=0; i<h2; i++){
        cin>>val;
        n2.push(val);
    }
    
    for(int i=0; i<h3; i++){
        cin>>val;
        n3.push(val);
    }
    
    cout<<equalStacks(n1, n2, n3);
    
    return 0;
    
}