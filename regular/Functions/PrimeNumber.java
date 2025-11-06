package regular.Functions;

import java.util.*;
public class PrimeNumber {
    public boolean isPrime(int n){
        if(n==2){
            return true;
        }

        // for(int i=2; i<=n-1; i++){
        //     if(n%i==0){
        //         return false;
        //     }
        // }

        // Optimized Way.

        for(int i=2; i<=Math.sqrt(n); i++){
           if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check wheter it is prime or not: ");
        int number = sc.nextInt();
        PrimeNumber obj = new PrimeNumber();
        boolean isPrime = obj.isPrime(number);
        System.out.print(" The number you entered is prime: "+isPrime);
        sc.close();
    }
}
