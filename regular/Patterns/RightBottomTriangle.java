package regular.Patterns;

import java.util.*;
public class RightBottomTriangle {
    public void Pattern(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row+col>=n+1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the sides of the grid: ");
        int side = sc.nextInt();
        RightBottomTriangle obj = new RightBottomTriangle();
        obj.Pattern(side);
        sc.close();
    }
}
