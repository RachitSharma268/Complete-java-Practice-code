package regular.Arrays;

import java.util.*;
public class Sampel {
    public void sampelArray(int array[]){
        for(int i=0; i<array.length; i++){
            array[i]+= 1;
            System.out.print(array[i]+" ");
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("Enter the element of the array");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        Sampel obj = new Sampel();
        obj.sampelArray(array);
        sc.close();
    }
}
