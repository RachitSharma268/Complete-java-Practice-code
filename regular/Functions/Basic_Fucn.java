package regular.Functions;

import java.util.Scanner;
public class Basic_Fucn {
    public  int Sum(int a,int b){ // Formal Parameter and Parameters.
        return a+b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the first number: ");
        int num2 = sc.nextInt();
        Basic_Fucn obj = new Basic_Fucn();
        int sum = obj.Sum(num1,num2);// arguments or actual parameters.
        System.out.println("Sum of the two number is: "+sum);
        sc.close();
    }
}

