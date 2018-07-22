/**
 * CC 
 * A simple program in C# 
 * With the help of Sololearn
 **/
using System;

namespace HelloWorldProgram{
 
 class HelloProgram{
     
     static void Main(string[] args){
         const var hellowWorldStatement = "Hello World!"; 
         console.WriteLine(hellowWorldStatement);

        if (hellowWorldStatement == 10){
            console.WriteLine("It's equal to the integer 10!!");
        }else{
            console.WriteLine("You have failed to solve it's equivalency.. :(");
        }
        boolean endLoop = false; 
        while(!endLoop){
            console.WriteLine("Going to end that loop..")
            endLoop = true; 
        }
        return 0; 
     }    
 }
 
}
