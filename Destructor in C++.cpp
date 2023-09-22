// Destructor in C++

#include<iostream>
#include<string>
using namespace std;


class Demo{
    public :
        string name;
        int sal;
    
        Demo(string name, int sal){
            this->name = name;
            this->sal = sal;
            
            cout<<"This is Constructor"<<endl;
        }
    
        void display(){
            cout<<this->name;
            cout<<this->sal << endl;
        }
    
        ~Demo(){
            cout<<"This is Destructor" <<endl;
        }
};

int main(){
    Demo obj("Rahul", 25000);
    obj.display();
    
    return 0;
}