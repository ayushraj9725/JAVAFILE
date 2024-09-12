import java.util.*;
public class BinomialCoff {

    public static int Factorial(int num) {
        int fact = 1;
         
        for(int i = 1 ; i <= num ; i++){
            fact = fact * i ;
        }
        return fact ;
    }

    public static int Binomial(int n , int r){
         int n_fact = Factorial(n);
         int r_fact = Factorial(r);
         int nmr_fact = Factorial(n-r);
         
         int BinoFact = n_fact /(r_fact * nmr_fact);
         return BinoFact ;
    } 
      public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n ");
         int n = sc.nextInt();
        System.out.println("Enter the r ");
         int r = sc.nextInt();
         int BinoFact = Binomial(n,r);
        System.out.println("Binomila coefficient of n and r = "+BinoFact );
        sc.close();
      }    
}

