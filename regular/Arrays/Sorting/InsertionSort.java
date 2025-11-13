package regular.Arrays.Sorting;

import java.util.Scanner;
public class InsertionSort {
    public void Sorting (int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1]  = curr;
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

        InsertionSort obj = new InsertionSort();
        obj.Sorting(array);
        obj.printArr(array);

        sc.close();
    }
}


