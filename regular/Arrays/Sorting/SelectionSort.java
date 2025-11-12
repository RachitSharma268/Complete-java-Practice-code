package regular.Arrays.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public  void Sorting(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j; 
                }
            }
            // Swapping

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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

        SelectionSort obj = new SelectionSort();
        obj.Sorting(array);
        obj.printArr(array);

        sc.close();
    }
}

