package live_session.patterns;

import java.util.Scanner;
public class HollowSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the grid: ");
        int number = sc.nextInt();
        for(int row=1; row<=number; row++){
            for(int col=1; col<=number; col++){
                if(row==1 || row==number || col==1 || col==number){
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
