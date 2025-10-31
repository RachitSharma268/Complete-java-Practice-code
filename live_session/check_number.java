package live_session;

import java.util.Scanner;
public class check_number {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check wheter it is negative or positive ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("The provided number "+num+" is positive :)");
        }else{
            System.out.println("The provided number "+num+" is negative :)");
        }
        sc.close();
    }
}
