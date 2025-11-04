package live_session;

import java.util.Scanner;
public class Multiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        for(int  i=1;i<=10;i++){
            int tabel = i*number;
            System.out.println(number+" X "+i+" = "+tabel);
        }
        sc.close();
    }
}
