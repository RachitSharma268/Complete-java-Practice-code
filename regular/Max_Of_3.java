package regular;

import java.util.*;
public class Max_Of_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+" Is greatest among all the three numbers");
        }else if(num2>num3){
            System.out.println(num2+" Is greatest among all the three numbers");
        }else{
            System.out.println(num3+" Is greatest among all the three numbers");
        }
        sc.close();
    }
}
