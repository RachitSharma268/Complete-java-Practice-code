package regular.Patterns;

import java.util.*;
public class HollowRohmbus {
    public void hollowRohmbus(int n){
        for(int i=1; i<=n; i++){

            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }

            //hollow Rectangel
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of grid");
        int sides = sc.nextInt();
        HollowRohmbus obj = new HollowRohmbus();
        obj.hollowRohmbus(sides);
        sc.close();
    }
}
