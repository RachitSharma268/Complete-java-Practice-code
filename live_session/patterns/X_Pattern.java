package live_session.patterns;

import java.util.Scanner;
public class X_Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of the gride: ");
        int number = sc.nextInt();
        for(int row=0; row<number; row++){
            for(int col=0; col<number; col++){
                if(col+row==number-1 || row==col){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
