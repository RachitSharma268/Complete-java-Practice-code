package regular.Patterns;

import java.util.Scanner;
public class Top_Left_Number_Triangle {
    public void Pattern(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row+col<=n+1){
                    System.out.print(col+" ");
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
        Top_Left_Number_Triangle obj = new Top_Left_Number_Triangle();
        obj.Pattern(side);
        sc.close();
    }   
}
