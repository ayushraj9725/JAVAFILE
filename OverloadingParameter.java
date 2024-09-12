// when we want to make or creat or define many function of same name in a class , then it is called overloading
// it always depends upon parameters that how many parameter pass in same name of function 
/* like int myFunction(int a ,int b)
  and float myFunction(int a ,int b)
  here we got some cumpilation erroe bcz it unable to be compile due to same parameters passed in both function
  it never depends upon return like int , float  */ 

  // This overloading is known as " overloading Parameter "" 

  class OLoding {

      public static int sum(int a , int b){
        return a+b ;
      }
  }
   
public class OverloadingParameter {

    //Function to calculate the sum of two numbers
    public static int sum(int a, int b){
        return a + b ;
    }

    //Function to calculate the sum of three numbers
    public static int sum(int a, int b, int c){
        return a + b + c ;
    }

    //Function to calculate the sum of two floating value   -> "OVERLOADING DATATYPE" !
    public static float sum(float a , float b){
        return a + b ;
    }
    public static void main(String args[]) {

        OLoding l = new OLoding();
        l.sum(2,4); /// her ethe seen restriction of calling static funtion by object 

        OLoding.sum(2,5);
          System.out.println(sum(30,50));
          System.out.println(sum(30,40,50));
          System.out.println(sum(35.45f,45.55f));
    }
}
