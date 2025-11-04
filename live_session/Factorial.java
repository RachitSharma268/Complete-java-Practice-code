package live_session;

import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.print("Enter the number factorial you want");
        int number = sc.nextInt();
        for(int i = number; i>=1; i--){
            factorial*= i;
        }
        System.out.println("Factorial of the "+number+" is :"+factorial);
        sc.close();
    }
}
