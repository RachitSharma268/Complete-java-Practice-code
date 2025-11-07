package regular.Patterns;

import java.util.*;
public class Dimanod {
    public void dimanod(int n){

        //1st half
        for(int i=1; i<=n; i++){
            
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }

            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print(" * ");
            }

            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--){
            
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }

            //Stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print(" * ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of grid");
        int sides = sc.nextInt();
        Dimanod obj = new Dimanod();
        obj.dimanod(sides);
        sc.close();
    }
}
