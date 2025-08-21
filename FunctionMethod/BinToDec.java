package FunctionMethod;

import java.util.Scanner;

import javax.lang.model.type.DeclaredType;

public class BinToDec {

    // public static void binToDec(int binNum){

    //     int myNum = binNum;

    //     int pow = 0;
    //     int decNum = 0;
        
    //     while (binNum > 0) {
    //         int lastDigit = binNum % 10;
    //         decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
    //         pow++;
    //         binNum = binNum/10;
    //     }
    //     System.out.println("Decimal of " + myNum + " = " + decNum);
    // }


    public static void decToBin(int n){
        int myBin = n;
        int pow = 0;
        int bin = 0;

        while (n > 0) {
           int rem = n % 2;
           bin = bin + (rem * (int)Math.pow(10, pow));
           pow++; 

           n = n / 2;

        }


        System.out.println("Binary form of " + myBin +  " = " +  bin);
    }



    public static void main(String[] args) {
    }
}
