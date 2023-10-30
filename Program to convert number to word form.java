// Program to convert number to word form

import java.util.Scanner;

public class NumberToWords {
    private static final String[] oneDigits = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] twoDigits = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] tensMultiple = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    public static String numberToWords(int num) {
        if (num == 0) {
            return "zero";
        }
        return convertToWords(num);
    }

    private static String convertToWords(int num) {
        if (num < 10) {
            return oneDigits[num];
        } else if (num < 20) {
            return tensMultiple[num - 10];
        } else if (num < 100) {
            return twoDigits[num / 10] + " " + oneDigits[num % 10];
        } else if (num < 1000) {
            return oneDigits[num / 100] + " hundred " + convertToWords(num % 100);
        } else if (num < 1000000) {
            return convertToWords(num / 1000) + " thousand " + convertToWords(num % 1000);
        } else {
            return "Number not supported";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        String wordForm = numberToWords(num);
        System.out.println("Word form: " + wordForm);
    }
}

