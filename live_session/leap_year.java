package live_session;

import java.util.Scanner;
public class leap_year {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year which you want to check for leap year: ");
        int year = sc.nextInt();
        if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)){
            System.out.println("The given year " +year+ " is Leap Year :)");
        }else{
            System.out.println("The given year " +year+ " is not a Leap Year :)");
        }
        sc.close();
    }
}
