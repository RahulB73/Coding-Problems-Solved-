// Patter 1

// *****
// ****
// ***
// **
// *

import java.util.*;

class Pattern {
    static void printPattern(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
            col--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows in Pattern : ");
        int row = sc.nextInt();
        System.out.print("Enter the colums in Pattern : ");
        int col = sc.nextInt();

        printPattern(row, col);
        sc.close();
    }
}