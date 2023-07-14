// Linked List Imlementation using c++

#include<iostream>
using namespace std;

class Node{
    public:
    
    int data;
    Node* next;
    
    Node(int val){
        data = val;
        next = NULL;
    }
};

void InsertAtTail(Node* &head, int val){
    Node* n = new Node(val);
    
    if(head == NULL){
        head = n;
        return;
    }
    
    Node* temp = head;
    while(temp->next != NULL){
        temp = temp->next;
    }
    
    temp->next = n;
}

void Display(Node* head){
    Node* temp = head;
    while(temp != NULL){
        cout<<temp->data<<"->";
        temp = temp->next;
    }
    cout<<endl;
}

int main(){
    Node* head = NULL;
    int n=10, val;
    for(int i=0; i<n; i++){
        cin>> val;
        InsertAtTail(head, val);
    }
    // InsertAtTail(head, 1);
    // InsertAtTail(head, 2);
    // InsertAtTail(head, 3);
    Display(head);
}