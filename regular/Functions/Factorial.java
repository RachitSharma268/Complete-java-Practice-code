package regular.Functions;

import java.util.*;
public class Factorial {
    public int Facto(int n){
        int product = 1;
        for(int i=1; i<=n; i++){
            product*= i;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();
        Factorial obj = new Factorial();
        int prod = obj.Facto(num1);
        System.out.println("Factorial of the numbers is: "+prod);
        sc.close();
    }
}
