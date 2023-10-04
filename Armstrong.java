// Armstrong number or not

import java.util.*;

public class Armstrong {

    static boolean isArmStrong(int n) {
        double sum = 0;
        int rev;
        int temp = n;
        int length = countDigit(n);

        while (n > 0) {
            rev = n % 10;
            sum = sum + Math.pow(rev, length);
            n = n / 10;
        }
        return sum == temp;
    }

    static int countDigit(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers to cheack armstrong or not : ");
        int num = sc.nextInt();

        boolean result = isArmStrong(num);

        if (result) {
            System.out.println("Given number is armstrong number");
        } else {
            System.out.println("Given number is not armstrong number");
        }
        sc.close();
    }
}
