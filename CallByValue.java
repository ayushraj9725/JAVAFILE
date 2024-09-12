public class CallByValue {

    public static void swap(int a ,int b){
        //swapping defination 
        int temp =a ;
        a = b ;
        b = temp ;
        System.out.println("after swapping a = " +a);
        System.out.println("abter swapping b = " +b);
    }
    public static void main(String args[]){
       int a = 5 ;
       int b = 6 ;
       swap(a,b); // swapping calling 
       System.out.println(a);
       System.out.println(b); //this both print same value that is a = 5 amd b = 6 
                              // because after swapping we have to print this inside the function
                              // in java that is called "call bye value" method and "call by referance" not work bcz of absence of pointers thuis is happend in C++ ! 
    }
    
}
