// Factorial of of given number

import java.util.Scanner;

class Main{
    static long Factorial(long num){
        long sum = 1;
        
        for(long i=num; i >= 1; i--){
            sum = sum * i;
        }
        
        return sum;
    }
    
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       long num = sc.nextLong();
       
       long result = Factorial(num);
       System.out.println("Factorial of " + num + " is "+result);
    }
}