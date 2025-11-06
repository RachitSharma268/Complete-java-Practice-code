package regular.Functions;

import java.util.*;
public class Binomial_Cofficient {
     public int Facto(int n){
        int product = 1;
        for(int i=1; i<=n; i++){
            product*= i;
        }
        return product;
    }
    public int ncr(int n, int r){
        int n_facto = Facto(n);
        int r_facto = Facto(r);
        int nmr_facto = Facto(n-r);

        int binCoeff = (n_facto)/(r_facto*nmr_facto);
        return binCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Enter the r: ");
        int r = sc.nextInt();
        Binomial_Cofficient obj = new Binomial_Cofficient();
        int finalAnswer = obj.ncr(n, r);
        System.out.println("Binomial Coffecient is :"+finalAnswer);
        sc.close();
    }
}
