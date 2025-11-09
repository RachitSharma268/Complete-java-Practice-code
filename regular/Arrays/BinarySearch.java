package regular.Arrays;

import java.util.Scanner;

public class BinarySearch {
    public void Search(int array[],int choice){
        int start = 0;
        int end = array.length-1;
        boolean find = false;
        while (start<=end) {
            int mid = ((start+end)/2);


            if(array[mid] == choice){
                System.out.println(choice+" Is present in the array at "+mid);
                find = true;
                break;
            }

            if(array[mid]<choice){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        if(!find){
            System.out.println(choice+" is not present in array");
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
        BinarySearch obj = new BinarySearch();
        obj.Search(array,choice);
        sc.close();
    }
}
