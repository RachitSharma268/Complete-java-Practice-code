package live_session;

import java.util.Scanner;
public class prin_week_days {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        String day;
        System.out.print("Enter the number of corresponding to the weekday (1-7): ");
        int dayNum = sc.nextInt();
        switch (dayNum) {
            case 1:
                day = "Monday";
                System.out.println("Day according to the entenderd number is "+day);
                break;
            case 2:
                day = "Monday";
                System.out.println("Day according to the entenderd number is "+day);
                break;
            case 3:
                day = "Monday";
                System.out.println("Day according to the entenderd number is "+day);
                break;
            case 4:
                day = "Monday";
                System.out.println("Day according to the entenderd number is "+day);
                break;
            case 5:
                day = "Monday";
                System.out.println("Day according to the entenderd number is "+day);
                break;
            case 6:
                day = "Monday";
                System.out.println("Day according to the entenderd number is "+day);
                break;
            case 7:
                day = "Monday";
                System.out.println("Day according to the entenderd number is "+day);
                break;                    
            default:
            System.out.println("Wrong Input by user :)");
            break;
        }
        sc.close();
    }
}
