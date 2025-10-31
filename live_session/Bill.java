package live_session;

import java.util.Scanner;
public class Bill {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the pencil :");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of the pen :");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of the eraser :");
        float eraser = sc.nextFloat();

        System.out.println("=======Your Bill=======");
        System.out.println("Price of the pencil :"+pencil);
        System.out.println("Price of the pen :"+pen);
        System.out.println("Price of the eraser :"+eraser);

        float total = pencil+pen+eraser;
        System.out.println("Total Price without gst :"+total);

        float gstAmount = total * 0.18f;
        System.out.println("Gst Amount :"+gstAmount); 

        float FinalAmount = total + gstAmount;
        System.out.println("Final Amount :"+FinalAmount); 

        
        System.out.println("==========================");

        sc.close();
    }
}
