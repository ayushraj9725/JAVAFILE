public class BinaryNoToDecNo {
    
    public static void BinToDec(int BinNum) {
        int myNum = BinNum ;
        int power = 0 ;
        int DecNum = 0 ;

        while(BinNum > 0){
            int lastDigit = BinNum % 10 ;
            DecNum = DecNum + (lastDigit * (int)Math.pow(2,power));  //pow() method is built method in java which calculate power

            power++ ;
            BinNum = BinNum / 10 ;
        }
       System.out.println("decimal number of "+myNum+ " is " +DecNum);
    }
    public static void main(String args[]){
        BinToDec(101);
        BinToDec(1011);
    }
    
}
