# Linked list implementation using library in python

from collections import deque

myList = deque()

for i in range(5):
    userInput = input("Enter a value: ")
    myList.append(userInput)

for item in myList:
    print(item, end="->")