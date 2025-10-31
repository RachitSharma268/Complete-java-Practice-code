package live_session;

import java.util.Scanner;
public class swaping_no_temp_veri {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("First number a = ");
        int a = sc.nextInt();
        System.out.print("Second number b = ");
        int b = sc.nextInt();
        System.out.println("======== Number Before Swapping ==========");
        System.out.println("First number a = "+a);
        System.out.println("Second number b = "+b);
        System.out.println("===========================================");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("======== Number After Swapping ==========");
        System.out.println("First number a = "+a);
        System.out.println("Second number b = "+b);
        System.out.println("===========================================");
        System.out.println("Swapping Compelet Congrats!");
        sc.close();
    }
}
