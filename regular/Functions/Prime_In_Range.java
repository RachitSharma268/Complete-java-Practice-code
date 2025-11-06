package regular.Functions;

import java.util.*;
public class Prime_In_Range {

    public boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
           if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number where up to you want the prime numbers: ");
        int number = sc.nextInt();
        Prime_In_Range obj =  new Prime_In_Range();
        obj.primeInRange(number);
        sc.close();
    }
}
