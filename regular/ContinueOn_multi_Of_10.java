package regular;

import java.util.*;
public class ContinueOn_multi_Of_10 {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the number of your choice: ");
            int number = sc.nextInt();
            
            if(number % 10 == 0){
                System.out.println("You entered a multiple of 10");
                continue;
            } else {
                System.out.println("Keep on entering the number");
            }
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("no")) {
                break;
            }
        }
        
        sc.close(); 
    }
}