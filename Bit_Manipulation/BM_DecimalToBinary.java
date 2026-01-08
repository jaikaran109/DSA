package Bit_Manipulation;


//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.


import java.util.*;
class BM_DecimalToBinary {
    static String decimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n & 1);
            n = n >> 1;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
        System.out.println(decimalToBinary(n)); 
    }
}




//Binary to Decimal
//class BinaryToDecimal {
//    static int binaryToDecimal(String bin) {
//        int result = 0;
//        for (int i = 0; i < bin.length(); i++) {
//            result = (result << 1) + (bin.charAt(i) - '0');
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//		  String n = input.next();
//		  System.out.println(binaryToDecimal(n)); 
//    }
//}

