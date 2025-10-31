package live_session;

import java.util.Scanner;
public class Area_Square {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides (length and breath) of the square :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = a*b;
        System.out.println("Area Of the Square is : "+area);
        sc.close();
    }
}
