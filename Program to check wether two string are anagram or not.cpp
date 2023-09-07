// Program to check wether two string are anagram or not
// What is mean of anagram ?
// - If two string contain the same character but in different order 
// - Ex: Rahul and luhaR
// - Approch 1- Sort both the string and compare 
// - Approch 2 - Checking frequency of characters in the string using map

#include <iostream>
#include <string>
#include <algorithm> // Include the <algorithm> header

using namespace std;

bool areAnagrams(string &str1, string &str2) {
    // Sort the characters within the strings
    sort(str1.begin(), str1.end());
    sort(str2.begin(), str2.end());

    // Check if the sorted strings are equal
    return str1 == str2;
}

int main() {
    string str1, str2;
    cout << "Enter two strings:" << endl;
    cin >> str1;
    cin >> str2;

    bool check = areAnagrams(str1, str2);

    if (check) {
        cout << "Strings are anagrams." << endl;
    } else {
        cout << "Strings are not anagrams." << endl;
    }

    return 0;
}
