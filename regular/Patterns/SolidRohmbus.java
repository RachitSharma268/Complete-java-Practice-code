package regular.Patterns;

import java.util.Scanner;
public class SolidRohmbus {
    public void rohmbus(int n){
        for(int i=1; i<=n; i++){

            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }

            //Stars
            for(int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of grid");
        int sides = sc.nextInt();
        SolidRohmbus obj = new SolidRohmbus();
        obj.rohmbus(sides);
        sc.close();
    }
}
