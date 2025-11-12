package regular.Arrays.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public void Sorting(int arr[]) {
        boolean alreadySorted = true;  // assume array is sorted

        for (int i = 0; i < arr.length - 1; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                    alreadySorted = false; // array wasn't sorted
                }
            }

            // If no swaps in this pass, break early
            if (swap == 0) {
                break;
            }
        }

        if (alreadySorted) {
            System.out.println("Array was already sorted!");
        }
    }

    public void printArr(int arr[]) {
        System.out.println("Array after sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("\nArray before sorting:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        BubbleSort obj = new BubbleSort();
        obj.Sorting(array);
        obj.printArr(array);

        sc.close();
    }
}
