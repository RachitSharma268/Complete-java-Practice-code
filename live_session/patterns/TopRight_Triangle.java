package live_session.patterns;

import java.util.Scanner;
public class TopRight_Triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sides of grid");
        int number = sc.nextInt();
        for(int row=0; row<number; row++){
            for(int cols=0; cols<number; cols++){
                if(row <= cols){
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
