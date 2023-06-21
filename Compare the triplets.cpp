// Compare the triplets

#include<iostream>
using namespace std;

int main(){
    int alice[3];
    int bob[3];
    int alicePoints = 0, bobPoints = 0;
    
    for(int i=0; i<3; i++){
        cin>>alice[i];
    }
    for(int i=0; i<3; i++){
        cin>>bob[i];
    }
    
    for(int i=0; i<3; i++)
    {
        if(alice[i] > bob[i])
        {
            alicePoints += 1;
        }
        else if(alice[i] < bob[i])
            {
                bobPoints += 1;
            }
            else{
                alicePoints += 0;
                bobPoints +=0;
            }
    }
    
    int result[2] = {alicePoints, bobPoints};
    
    for(int i=0; i<2; i++){
        cout << result[i]<<" ";
    }
}