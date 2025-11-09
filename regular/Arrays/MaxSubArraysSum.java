package regular.Arrays;

import java.util.*;
public class MaxSubArraysSum {
    // public void maxSum(int array[]){
    //     int currentSum;
    //     int maxSum = Integer.MIN_VALUE;

    //     int prefix[] = new int[array.length]; // creating the prefix array.
    //     prefix[0]=array[0];

    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1]+array[i];
    //     }

    //     for(int i=0; i<array.length; i++){
    //         for(int j=i; j<array.length; j++){
    //             currentSum = 0;
    //             // currentSum += array[k];
    //             currentSum = i == 0 ? prefix[j]: prefix[j] - prefix[i-1]; // using prefix sum. 
    //             System.out.println(currentSum);
    //             if(maxSum<currentSum){
    //                 maxSum = currentSum;
    //             }
    //         }
    //     }
    //     System.out.println("Maximum Sum Of The SubArray is:"+maxSum);
    // }

        //Optimal solution as per the Kadanes solution

        public void Kadanes(int array[]){
            int currentSum =0;
            int maxSum = Integer.MIN_VALUE;

            for(int i=0; i<array.length; i++){
                currentSum += array[i]; 
                if(currentSum<0){
                    currentSum=0;
                }
                maxSum = Math.max(maxSum, currentSum);
            }

            System.out.println("Our Maximum Sum from all the sub arraya is: "+maxSum);

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
        MaxSubArraysSum obj = new  MaxSubArraysSum();
        obj.Kadanes(array);
        sc.close();
    }
}
