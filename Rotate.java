// Program to rotate a number right and left

import java.util.*;

public class Rotate {
    static int rotateRight(int num) {
        int length = coutDigits(num);

        int n1 = num % 10;
        int n2 = num / 10;
        return (n1 * pow(10, length - 1)) + n2;
    }

    static int rotateLeft(int num) {
        int length = coutDigits(num);
        int n1 = num / pow(10, length - 1);
        int n2 = num % pow(10, length - 1);
        return (n2 * 10) + n1;
    }

    // Calculate the power
    static int pow(int base, int power) {
        int sum = 1;
        while (power > 0) {
            sum = sum * base;
            power--;
        }
        return sum;
    }

    // Count the Digits
    static int coutDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int position = sc.nextInt();
        sc.close();

        int r = 0;
        int l = 0;
        int temp = num;

        for (int i = 0; i < position; i++) {
            r = rotateRight(num);
            l = rotateLeft(temp);

            num = r;
            temp = l;
        }

        System.out.println(r);
        System.out.println(l);
    }
}
