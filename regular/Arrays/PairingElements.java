package regular.Arrays;

import java.util.*;
public class PairingElements {
    public void paringElement(int arr[]){
        for(int i=0; i<arr.length; i++){
            int currElement = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("( "+ currElement +" , "+ arr[j]+ " ) ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("Enter the element of the array ");
        for(int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        PairingElements obj = new PairingElements();
        obj.paringElement(array);
        sc.close();
    }
}