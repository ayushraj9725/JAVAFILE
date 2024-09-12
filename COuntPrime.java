import java.util.*;

public class COuntPrime {
    public static List< Integer > countPrimes(int n) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();

        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime,true);

        for(int i = 2 ; i*i < n; i++){
            if(isPrime[i]){
                for(int j = i*i ; j<n ;j = j + i){
                    isPrime[j] = false ;

                }
            }
        }
        for(int i = 2 ;i < n ;i++){
            if(isPrime[i]){
                for(int j = 2 ;j < n ; j++){
                    if(i * j == n){
                        list.add(i);
                    }
                }
            }
        
    }

     return list ;
    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println(countPrimes(35));
        sc.close();
    }
}

