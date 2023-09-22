// Progrm to find given number is pallindorm or not


import java.util.Scanner;

class Main{
    public static boolean isPallindrom(int number){
        int O_number = number;
        int reversedNumber = 0;
        
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return O_number == reversedNumber;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        boolean Check = isPallindrom(number);
        
        if(Check == true){
            System.out.println("Number is pallindorm");
        }
        else{
            System.out.println("Number is not pallindorm");
        }
    }
}