package FunctionMethod;

import java.util.Scanner;

class JavaBasic {

    public static int calculateSum (int num1, int num2){ // Parameters or formal parameters
        int sum = num1 + num2;
        return sum; 
    }

    public static void swap (int a , int b) {

        // wsap 
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = calculateSum(a, b); //// arguments or actual parameter
        // System.out.println("Sum is : " + sum);

        // swap -- values exchange

        int a = 5;
        int b = 10;
         swap(a, b);
        

    }
}