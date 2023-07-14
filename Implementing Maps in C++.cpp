// Implementing Maps in C++

#include <iostream>
#include <map>
#include <string>

int main() {
    std::map<int, std::string> myMap;

    int key;
    std::string value;

    std::cout << "Enter key-value pairs (enter -1 to stop):\n";

    while (true) {
        std::cout << "Enter key: ";
        std::cin >> key;

        if (key == -1)
            break;

        std::cout << "Enter value: ";
        std::cin >> value;

        myMap[key] = value;
    }

    std::cout << "\nKey-value pairs in the map:\n";

    for (const auto& pair : myMap) {
        std::cout << "Key: " << pair.first << ", Value: " << pair.second << std::endl;
    }

    return 0;
}
