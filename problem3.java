import java.util.Scanner;
public class problem3 {
    public static void changeCelsius(int s,int e,int w){
        int  i ,c ;
        i = s ;
        while( i < e){

            c = (int)((i - 32)*5)/9 ;
            System.out.println(i +"\t"+ c );

            i = i + w ;
        }

    }
    

public static void main(String args[]) {
    
    // Write code here
    Scanner sc = new Scanner(System.in);

    int S = sc.nextInt();   // start fahrenheit value
    int E = sc.nextInt();  // end fahrenheit value 
    int W = sc.nextInt(); // size of gap

    changeCelsius(S,E,W);
    
    sc.close();
   }
}
