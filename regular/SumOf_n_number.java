package regular;

import java.util.*;
public class SumOf_n_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        int num = sc.nextInt();
        int count = 0, sum= 0;
        while(num>=count){
            sum+= count;
            count++;
        }
        System.out.println("Sum upto the given " +num+ " number "+sum); 
        sc.close();
    }
}
