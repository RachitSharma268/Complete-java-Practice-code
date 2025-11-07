package regular.Patterns;

import java.util.Scanner;
public class FloydsTriangle {
    public void Pattern(int n){
        int number = 1;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row>=col){
                    System.out.print(number+" ");
                    number++;
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
        FloydsTriangle obj = new FloydsTriangle();
        obj.Pattern(side);
        sc.close();
    }   
}
