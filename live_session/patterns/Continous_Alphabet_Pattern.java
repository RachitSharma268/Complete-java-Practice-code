package live_session.patterns;

import java.util.Scanner;
public class Continous_Alphabet_Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char chars ='A';
        System.out.print("Enter the side of the grid: ");
        int number = sc.nextInt();
        for(int row=0; row<number; row++){
            for(int col=0; col<number; col++){
                if(row>=col){
                    System.out.print(chars+" ");
                    chars++;
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
