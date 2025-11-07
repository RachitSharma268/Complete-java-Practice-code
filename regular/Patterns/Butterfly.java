package regular.Patterns;

import java.util.Scanner;

public class Butterfly {
    public void Pattern(int n){

        // 1st half

        for(int row=1; row<=n; row++){

            // stars
            for(int cols=1; cols<=row; cols++){
                System.out.print(" * ");
            }
            
            // spaces
            for(int cols=1; cols<=2*(n-row); cols++){
                System.out.print("   ");
            }
            // stars

            for(int cols=1; cols<=row; cols++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //2nd Half

        for(int row=n; row>=1; row--){

            // stars
            for(int cols=1; cols<=row; cols++){
                System.out.print(" * ");
            }
            
            // spaces
            for(int cols=1; cols<=2*(n-row); cols++){
                System.out.print("   ");
            }
            // stars

            for(int cols=1; cols<=row; cols++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of grid");
        int sides = sc.nextInt();
        Butterfly obj = new Butterfly();
        obj.Pattern(sides);
        sc.close();
    }
}
