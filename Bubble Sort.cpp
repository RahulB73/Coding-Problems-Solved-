// Bubble Sort

#include<iostream>
using namespace std;

void swap(int &a, int &b){  
    int temp = a;
    a = b;
    b = temp;
}

void bubbleSort(int list[], int n){
    for(int i = 0; i < n - 1; i++){  
        for(int j = 0; j < n - i - 1; j++){  
            if(list[j] > list[j+1]){
                swap(list[j], list[j+1]);
            }
        } 
    } 
}

int main(){
    int n;
    cout << "Enter the number of elements inside the list: ";
    cin >> n;
    int list[n];
    cout << "Enter the elements of the list: ";
    for(int i = 0; i < n; i++){  
        cin >> list[i];
    }

    bubbleSort(list, n);

    cout << "Sorted array is: ";
    for(int i = 0; i < n; i++){
        cout << list[i] << " ";
    }

    return 0;
}
 




