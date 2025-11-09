package regular.Arrays;

import java.util.*;
public class LinearSearch {
    public void Search(int array[], int choice){
        boolean found = false;
        for(int i=0; i<array.length; i++){
            if(array[i] == choice){
                System.out.println("Number " +choice+ " find at position " +i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("The Number " +choice+ " is not present in array");
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
        System.out.print("Enter the choice from the array ");
        int choice = sc.nextInt();
        LinearSearch obj = new LinearSearch();
        obj.Search(array, choice);
        sc.close();
    }
}
