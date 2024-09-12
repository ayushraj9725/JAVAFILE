import java.util.*;
public class FactorialNum {

    public static int Factorial(int n) {
        int fact = 1;
         
        for(int i = 1 ; i <= n ; i++){
            fact = fact * i ;
        }
        return fact ;
    }
      public static void main(String args[]){
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
        //  FactorialNum f = new FactorialNum();
        //  System.out.println(f.Factorial(number));   //if we not declared static function then we need to creat an instance of class 
        if(number < 0){
            System.out.println("Factorial is not exist of negative numbers !");
        }
        else if(number == 0){
            System.out.println("fact = 1");
        }

        else {
           int factorial = Factorial( number );
           System.out.println("Factorial of the number is " +factorial);
        }

        sc.close();
      }    
}
