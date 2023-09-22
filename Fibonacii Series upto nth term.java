// Fibonacii Series upto nth term

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Choose the method to find Fibonacci Series");
        System.out.println("Enter 1 for Iterative Method");
        System.out.println("Enter 2 for Recursive Method");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Fibonacci Series Using Iterative Method");
                int n1 = 0;
                int n2 = 1;
                System.out.print(n1 + " " + n2 + " ");
                for (int i = 2; i < n; i++) {
                    int n3 = n1 + n2; // Fixed missing declaration of n3
                    System.out.print(n3 + " ");
                    n1 = n2;
                    n2 = n3;
                }
                break;

            case 2:
                System.out.println("Fibonacci Series Using Recursive Method");
                for (int i = 0; i < n; i++) {
                    System.out.print(FibonacciRecursive(i) + " ");
                }
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
        
        sc.close();
    }

    static int FibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2);
    }
}


