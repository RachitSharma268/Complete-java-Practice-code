package regular.Arrays;

import java.util.*;
public class PrintSubArrays {
    public void subArrays(int array[]){
        for(int i=0; i<array.length; i++){
            int start = i;
            for(int j=i; j<array.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("Enter the element of the array ");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        PrintSubArrays obj = new  PrintSubArrays();
        obj.subArrays(array);
        sc.close();
    }
}
