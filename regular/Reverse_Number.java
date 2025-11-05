package regular;

import java.util.*;
public class Reverse_Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of your choice");
        int number = sc.nextInt();
        int reverse = 0;
        while(number!=0){
            int lastDigit = number%10;
            reverse = reverse*10+lastDigit;
            number/=10; 
        }
        System.out.println("Reverse of the given "+number+" is: "+reverse);
        sc.close();

    }
}
