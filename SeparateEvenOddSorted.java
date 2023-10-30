// Separate and sort the elements of the array into odd and even eleements 

import java.util.*;

public class SeparateEvenOddSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenPointer = 0;
        int oddPointer = n - 1;

        while (evenPointer < oddPointer) {
            if (arr[evenPointer] % 2 != 0) {
                // Swap an even element with an odd element
                int temp = arr[evenPointer];
                arr[evenPointer] = arr[oddPointer];
                arr[oddPointer] = temp;
            }

            if (arr[evenPointer] % 2 == 0) {
                evenPointer++;
            }

            if (arr[oddPointer] % 2 != 0) {
                oddPointer--;
            }
        }

        // Sort even and odd subarrays
        Arrays.sort(arr, 0, evenPointer);
        Arrays.sort(arr, evenPointer, n);

        // Print the rearranged and sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
