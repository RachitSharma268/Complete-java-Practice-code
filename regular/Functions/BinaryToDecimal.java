package regular.Functions;

import java.util.*;
public class BinaryToDecimal {
    public void DecimalNo(int binaryNumber){
        int pow=0,decimal=0;
        int temp  = binaryNumber;
        while (temp!=0) {
            int lastBinary =temp % 10;
            decimal+= (lastBinary * (int)Math.pow(2, pow));

            pow++;
        temp/= 10;
        }
        System.out.println("Decimal of "+binaryNumber+" is "+decimal);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number ");
        int binaryNumber = sc.nextInt();
        BinaryToDecimal obj = new BinaryToDecimal();
        obj.DecimalNo(binaryNumber);
        sc.close();
    }
}
