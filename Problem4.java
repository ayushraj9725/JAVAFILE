import java.util.Scanner;
import java.util.Arrays;
public class Problem4 {
    public static int largestNum(int arr[]){
        int largest = Integer.MIN_VALUE ;
      /*   for(int i =0 ;i< arr.length ;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        } */

        for(int i : arr){
            largest = Math.max(largest,i);
        }

        int minimest = Integer.MAX_VALUE ;
        for(int i : arr){
            minimest = Math.min(minimest,i);
        }
        System.out.println("Minimest number is :"+minimest);
        return largest ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i =0 ;i< arr.length ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(largestNum(arr));

        int index = Arrays.binarySearch(arr,3);
        System.out.println("searched Index is "+index+" of 3 ");

    

        sc.close();
    }
}
