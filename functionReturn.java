import java.util.*;
public class functionReturn {

     public static int calculateSum(int num1,int num2){ //this passing parameter is called formal parameters !
        int sum = num1 + num2 ;
        return sum ;
     }

     public static void main(String args[]){
         //HLO(); //Function calling here 
      Scanner sc = new Scanner(System.in);
     
      int num1 = sc.nextInt(); //that num1 and this num1 are both different not same 
      int num2 = sc.nextInt();
      int sum = calculateSum(num1 ,num2); //this parameters passing called actual parameters or arguments !

      System.out.println("sum of two number is " +sum);

      sc.close();

     }
  }