public class DecToBinary {
    public static void DecToBin(int DeciNo){
        int Decimalnum = DeciNo ;
        int pow = 0 ;
        int BinaNo = 0 ;
        while(DeciNo > 0){
                int rem = DeciNo % 2 ;
                BinaNo = BinaNo + (rem *(int) Math.pow(10,pow)); //type cast because it understand it is double type number
                pow++ ;
                DeciNo = DeciNo / 2 ; 
        }
        System.out.println("Binary number of "+Decimalnum+ " = " +BinaNo);
    }
    public static void main(String args[]){
             DecToBin(20);
             DecToBin(199);
    }
    
}
