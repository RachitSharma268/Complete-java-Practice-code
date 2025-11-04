package live_session;

import java.util.Scanner;
public class Sum_even_odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evenNum = 0, oddNum= 0;
        System.out.println("Enter the set of the number you want: ");
        int num = sc.nextInt();
        System.out.println("Enter the number of your chooice:");
        for(int i=0; i<num; i++){
            int Number = sc.nextInt();
            if(Number%2==0){
                evenNum+= Number;
            }else{
                oddNum+= Number;
            }
        }
        System.out.println("Sum of the odd number: "+oddNum);
        System.out.println("Sum of the even number: "+evenNum);
        sc.close();
    }
}
