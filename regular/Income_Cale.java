package regular;

import java.util.*;
public class Income_Cale {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income");
        int income = sc.nextInt();
        if(income <500000){
            int tax = 0;
            System.out.println("Toatl tax that should be paied is "+tax);
        }else if(income >500000 && income<1000000){
            int tax = (int) (income*0.2);
            System.out.println("Toatl tax that should be paied is "+tax);
        }else if(income >1000000 ){
            int tax = (int) (income*0.3);
            System.out.println("Toatl tax that should be paied is "+tax);
        }
        sc.close();
    }
}
