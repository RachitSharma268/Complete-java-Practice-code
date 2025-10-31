package live_session;

import java.util.Scanner;
public class Averrage {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the three number which you want the average of :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        int avg = sum/3;
        System.out.print("Average of the three number is : " + avg); 
        sc.close();
    }
}
