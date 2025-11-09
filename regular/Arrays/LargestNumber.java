package regular.Arrays;

import java.util.*;
public class LargestNumber {
    public void Maximum(int array[]){ 
        int max = array[0], position=0;
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
                position = i;
            }
        }
        System.out.println(max+" Is a Maximum number at the position of"+position);
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
        LargestNumber obj = new LargestNumber();
        obj.Maximum(array);
        sc.close();
    }
}
