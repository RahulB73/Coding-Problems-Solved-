// Valid Paranthesis (Stack Problem - Leetcode)

#include <iostream>
#include <stack>
#include <unordered_map>

bool isValidParentheses(const std::string& s) {
    std::stack<char> parenthesesStack;
    std::unordered_map<char, char> parenthesesMap = {
        {')', '('},
        {']', '['},
        {'}', '{'}
    };

    for (char c : s) {
        if (c == '(' || c == '[' || c == '{') {
            parenthesesStack.push(c);
        } else if (c == ')' || c == ']' || c == '}') {
            if (parenthesesStack.empty() || parenthesesStack.top() != parenthesesMap[c]) {
                return false;
            }
            parenthesesStack.pop();
        }
    }

    return parenthesesStack.empty();
}

int main() {
    std::string input;
    std::cout << "Enter a string with parentheses: ";
    std::cin >> input;

    if (isValidParentheses(input)) {
        std::cout << "The parentheses are balanced." << std::endl;
    } else {
        std::cout << "The parentheses are not balanced." << std::endl;
    }

    return 0;
}

// class Solution {
// public:
//     bool isValid(string s) {
//         stack<char> st;
//     for(char c : s){
//         if(c == '('|| c == '{' || c == '['){
//             st.push(c);
//         }else{
//             if(st.empty()) return false;
//             if(c == ')' && st.top() != '(') return false;
//             if(c == '}' && st.top() != '{') return false;
//             if(c == ']' && st.top() != '[') return false;
//             st.pop();
//         }
//     }
//     return st.empty();
//     }
// };
