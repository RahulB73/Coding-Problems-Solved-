// Prime number or Not
// Count of Prime number in n number
// Print prime number between 1 to n

import java.util.Scanner;

class Prime{
    static boolean isPrime(int n){
        if(n == 0){
            return false;
        }
        
        if(n == 1){
            return false;
        }
        
        // if(n ==2  || n == 3){
        //     return true;
        // }
        
        // Not work for 2 or 3 but best for time and space complexity
        // for(int i=1; i<= Math.sqrt(n); i++){
        //     if(n % i == 0){
        //         return false;
        //     }
        // }
        
        // Not work for 0 or 1
         for(int i=2; i<= n-1; i++){
            if(n % i == 0){
                return false;
            }
        }
        
        
        // for(int i=2; i<= n/2; i++){
        //     if(n % i == 0){
        //         return false;
        //     }
        // }
        
        return true;
         
    }
    
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int range = 2;
       int count = 0;
       
       boolean result = isPrime(n);
       
       System.out.print("Prime numbers are in between 1 to "+ n +" are : ");
       while(range < n){
           boolean r = isPrime(range);
           if(r == true){
               System.out.print(range + " ");
               count++;
           }
           range++;
       }
       
       System.out.println();
       System.out.println("Total number of prime numbers in between 1 to "+n+ " is "+count);
       
       if(result == true){
           System.out.println(n + " is a prime number");
       }
       else{
           System.out.println(n + " is not a prime number");
       }
    }
}