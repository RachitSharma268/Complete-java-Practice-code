package regular;

import java.util.*;
public class BreakOn_multi_Of_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter the number of your choice: ");
            int number = sc.nextInt();
            if(number%10==0){
                System.out.print("You enter the number multipel of 10");
                break;
            }else{
                System.out.print("Keep on entering the number");
            }
        }

        sc.close();
    }
}
