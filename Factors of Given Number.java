// Factors of Given Number

import java.util.Scanner;

class Main{
    static void factors(int n){
        int sum = 0;
        int count = 0;
        
        System.out.print("Factors of " + n + " are : ");
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                sum += i;
                count = count + 1;
            }
        }
        System.out.println();
        System.out.print("Factors of " + n + " excet  1 and itself are : ");
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                 
            }
        }
        System.out.println();
        System.out.print("Sum of factor is : ");
        System.out.println(sum);
        System.out.print("Count of factors is : ");
        System.out.println(count);
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        factors(n);
    }
}