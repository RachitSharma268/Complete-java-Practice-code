package regular.Patterns;

import java.util.Scanner;
public class Zero_One_Triangle {
    public void Pattern(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row>=col && (row+col)%2!=0){
                    System.out.print(" 0 ");
                }else if(row>=col && (row+col)%2==0){
                    System.out.print(" 1 ");
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
        Zero_One_Triangle obj = new Zero_One_Triangle();
        obj.Pattern(side);
        sc.close();
    }   
}
