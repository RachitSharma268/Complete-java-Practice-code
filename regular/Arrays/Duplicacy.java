package regular.Arrays;

import java.util.*;
public class Duplicacy {

    public  boolean findDuplicate(int nums[]){
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }

        // Optimal Solution

        Arrays.sort(nums);

        for(int i=0; i<=nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;
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
        Duplicacy obj = new  Duplicacy();
        boolean duplicate = obj.findDuplicate(array);
        System.out.println(duplicate);
        sc.close();
    }
}