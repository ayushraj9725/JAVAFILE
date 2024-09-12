public class PrimeNoForRange {

    public static boolean isPrime(int n) {
        for(int i = 2 ; i <= Math.sqrt(n) ;i++){
             if(n  % i == 0){
                return false ;
             }
        }
    return true ;
    }
    public static void PrimeInRange(int n){
        for( int j = 2 ;j <= n ; j++){
          if(isPrime(j)){  // it means true already understood 
          System.out.print(j+ " ");
          }
        }

    }
    public static void main(String args[]){
        PrimeInRange(200);  // it will not return any value so we are calling directly !
    }
}
