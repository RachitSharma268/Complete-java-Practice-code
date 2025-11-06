package regular.Functions;

import java.util.*;
public class Product {
    public int Multiply(int a, int b){
        return a*b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the first number: ");
        int num2 = sc.nextInt();
        Product obj = new Product();
        int multiply = obj.Multiply(num1, num2);
        System.out.println("Multiplication of two numbers is: "+multiply);
        sc.close();
    }
}
