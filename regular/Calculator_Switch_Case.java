package regular;

import java.util.*;
public class Calculator_Switch_Case {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator you want to perfome on numbers ");
        char oprator = sc.next().charAt(0);
        switch (oprator) {
            case '+':
                System.out.println("Sum of the above two number is: "+num1+num2);
                break;
            case '-':
                System.out.println("Substraction of the above two number is: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication of the above two number is: "+(num1*num2));
                break;
            case '/':
                System.out.println("Division of the above two number is: "+(num1/num2));
                break;
            case '%':
                System.out.println("Remender of the above two number is: "+(num1%num2));
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
        sc.close();
    }
}
