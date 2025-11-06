package regular;

import java.util.*;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        System.out.print("Enter the number of your choice: ");
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                cnt++;
            }
            if(cnt > 2) {
                break;
            }
        }
        if(cnt == 2) {
            System.out.println("Entered number is a prime number");
        } else {
            System.out.println("Entered number is not a prime number");
        }
        
        sc.close();
    }
}