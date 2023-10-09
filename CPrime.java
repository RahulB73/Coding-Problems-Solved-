// Circular Prime or not

import java.util.*;

public class CPrime {
    
    
    static boolean isCirPrime(int num) {
        // Coverting number to string
        // String strNum = String.valueOf(num);

        // Finding length of the string
        // int length = strNum.length();
        int length = count(num);

        for (int i = 0; i < length; i++) {
            // Cheaking the number is prime or not + if not prime return false
            // strNum is again converted to integer

            //if (!isPrime(Integer.parseInt(strNum))) {
            //     return false;
            // }
            
            if(!isPrime(num)){
                return false;
            }

            // Rotating the number
            // strNum = strNum.substring(1) + strNum.charAt(0);
            num = rotate(num);
        }
        return true;
    }

    // Checking the number is prime or not
    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Counting the lenght of number
    static int count(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
    
    // rotating the digit
    static int rotate(int num){
        int length = count(num);
        int n1 = num % 10;
        int n2 = num / 10;
        return ( n1 * (int) Math.pow(10, length - 1)) + n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check for Circular Prime : ");
        int number = sc.nextInt();

        System.out.print("Enter the range to find in between circular prime : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        // Checking the number is prime or not
        boolean Result = isCirPrime(number);
        if (Result) {
            System.out.println(number + " is a circular prime");
        } else {
            System.out.println(number + " is a not circular prime");
        }

        // Printing circular prime series in range
        System.out.println("Number of circular prime between " + start + " and " + end + " are : ");
        for (int i = start; i <= end; i++) {
            boolean r = isCirPrime(i);
            if (r) {
                System.out.print(i + " ");
            }
        }
        sc.close();

    }
}
