package regular.Functions;

import java.util.*;
public class DecimalToBinary {
    public void BinaryNumber(int decimalNumber){
        int pow = 0, binary = 0, temp = decimalNumber;
        while(temp!=0){
            int rem = temp%2;
            binary = binary+rem*((int)Math.pow(10,pow));

            pow++;
            temp = temp/2;
        }
        System.out.println("Binary of the "+decimalNumber+ " is "+binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal number of your choice: ");
        int decimal = sc.nextInt();
        DecimalToBinary obj = new DecimalToBinary();
        obj.BinaryNumber(decimal);
        sc.close();
    }
}
