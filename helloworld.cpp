/**
 * CC 
 * A Hello World program in C++ 
 * With the help of Sololearn
 **/
#include <iostream>
#include <cstdlib>
using namespace std; 

int main{

    const string helloWorldStatement = "Hello World!"; 
    int i = 10;
    int randomNumber = rand() % 15;
    cout<<helloWorldStatement << endl;
    while(i != 0){
        cout<<"**" << helloWorldStatement << "**" << endl; 
        i--;
        for(int j = 0; j < 5; j++){
            cout<<"Wowza You hit the for loop!: "<< j << endl;
        }
        do{
            cout<<"Oh my hit the do while loop: "<< randomNumber << endl;
            randomNumber--; 
        }while(randomNumber > 0)
    }


    return 0;

}
