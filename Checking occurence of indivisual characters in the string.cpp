// Checking occurence of indivisual characters in the string
// Approch 1  -> Use two loops to find occurence
// Approch 2  -> Use map 


#include<iostream>
#include<string>
using namespace std;

void checkOccurrence(string str) {
    for (int i = 0; i < str.length(); i++) {
        if (str[i] == '\0') {
            continue; // Skip characters that have been counted
        }

        int count = 1;

        for (int j = i + 1; j < str.length(); j++) {
            if (str[i] == str[j]) {
                count++;
                str[j] = '\0'; // Mark the character as counted
            }
        }

        cout << str[i] << " is repeated " << count << " times." << endl;
    }
}

int main() {
    string str;
    cout << "Enter a string: ";
    cin >> str;

    checkOccurrence(str);

    return 0;
}

// Approch 2 

// #include <iostream>
// #include <string>
// #include <unordered_map>
// using namespace std;

// void checkOccurrence(const string& str) {
//     unordered_map<char, int> charCount;

//     for (char ch : str) {
//         charCount[ch]++;
//     }

//     for (const auto& pair : charCount) {
//         cout << pair.first << " is repeated " << pair.second << " times." << endl;
//     }
// }

// int main() {
//     string str;
//     cout << "Enter a string: ";
//     cin >> str;

//     checkOccurrence(str);

//     return 0;
// }

