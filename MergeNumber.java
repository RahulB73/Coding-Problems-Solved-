// Merging Two or more numbers
public class MergeNumber {

    public static int mergeNumber(int num1, int num2) {
        int temp = num2;
        // int length = countDigit(num2);
        while (temp > 0) {
            num1 = num1 * 10;
            temp = temp / 10;
        }

        // return (m + Math.pow(10, length)) + m;

        return num1 + num2;
    }

    // Count the number of digits
    static int countDigit(int n) {
        // int count = (int) Math.log10(n) + 1;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number to merge : ");
        int num2 = sc.nextInt();

        int result = mergeNumber(num1, num2);

        System.out.println("The merged number is " + result);
        sc.close();
    }
}
