package regular.Arrays;

import java.util.*;
public class Reverse {
    public void reverseArray(int array[]){
        // for(int i=array.length-1; i>=0; i--){
        //     System.out.print(array[i]+" ");
        // }

        int start = 0 ,  last = array.length-1;
        while (start < last) {
            int temp = array[last];
            array[last] = array[start];
            array[start] = temp;

            start++;
            last--;
        }
        System.out.println("Reversed Array");
        for(int num : array){
            System.out.print(num+" ");
        }
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("Enter the element of the array ");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        Reverse obj = new Reverse();
        obj.reverseArray(array);
        sc.close();
    }
}
