package live_session.patterns;

import java.util.Scanner;
public class square {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square for the pattern: ");
        int number = sc.nextInt();
        for(int row=0;row<number;row++){
            for(int col=0;col<number;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();

    }
}
