// Saparate Array into even odd 

import java.util.*;

class SeparateEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize two pointers for even and odd positions
        int evenPointer = 0;
        int oddPointer = 1;

        while (true) {
            // Find the first even element after the evenPointer
            while (evenPointer < n && arr[evenPointer] % 2 == 0) {
                evenPointer += 2;
            }

            // Find the first odd element after the oddPointer
            while (oddPointer < n && arr[oddPointer] % 2 != 0) {
                oddPointer += 2;
            }

            // If no more even or odd elements are found, break the loop
            if (evenPointer >= n || oddPointer >= n) {
                break;
            }

            // Swap the even and odd elements
            int temp = arr[evenPointer];
            arr[evenPointer] = arr[oddPointer];
            arr[oddPointer] = temp;
        }

        // Print the rearranged array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
