/*
  "FUNCTION"
   function in java is define as the block/group of code which perform a particular task or thing !
   and that particular task we can do again and again by simple calling 
   -> function is the reusable part of code !
   "SYNTAX"
   returnType name() {
    //body 
    return statement ;
   } 
   Methods -> that function or method written within the class in java is known as Methods 
   another syntax passing parameters
   returnType name( datatype para1 , .....){
    //body 
    return something 
   }
 */
 import java.util.*;
 public class Introfunction {
     /* public static void HLO() {
         System.out.println("Hello World !");
     } */

     public static void calculateSum(int num1,int num2){
        int sum = num1 + num2 ;
        System.out.println("sum of two number is " +sum);
     }
     public static void main(String args[]){
         //HLO(); //Function calling here 
      Scanner sc = new Scanner(System.in);
     
      int num1 = sc.nextInt(); //that num1 and this num1 are both different not same 
      int num2 = sc.nextInt();
      calculateSum(num1 ,num2);

      sc.close();

     }
  }
