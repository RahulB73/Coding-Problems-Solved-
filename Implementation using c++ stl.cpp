// Implementation using c++ stl

#include<iostream>
#include<list>
using namespace std;

int main(){
    list <int> List;
    
    int n = 10;
    
     for(int i = 0; i<n; i++){
        cin >> i; 
        List.push_back(i);
    }
    
    
    for(auto i : List){
        cout<< i << "->";
    }
}