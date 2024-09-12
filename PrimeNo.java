import java.util.*;
public class PrimeNo {
    
    public static boolean isPrime(int n) {
        if(n == 2) {
            System.out.println(" 2 is a prime number");
        }
          for(int i = 2 ; i <= Math.sqrt(n) ; i++) { // i < n
            if(n % i == 0){
                return false ;
            }
        }
    
        return true ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        //isPrime(n);
        
        if(isPrime(n) == true) {
            System.out.println("number is prime number ");
        }
        else 
        {
            System.out.println("number is co prime number ");
        }
        sc.close();
    }
    
}
