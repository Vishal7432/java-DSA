package FunctionMethod;

import java.util.Scanner;

public class Practice {

    
    public static void Avsum(){

         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  first = ");
        int a = sc.nextInt();

        System.out.println("Enter the number second  = ");
        int b = sc.nextInt();

        System.out.println("Enter the number thrird = ");
        int c = sc.nextInt();

        int sum = (a + b + c)/3;
        
        System.out.println("Average of Three number is :" + sum);
    }


    public static boolean isEven(int n) {
        boolean isEven =  (n % 2 == 0); 
          System.out.println("Give argument is " + isEven );
          
        return isEven;

    }


    public static void PaliNum(int n) {
        
        int Original = n;
        int rev = 0;

        while (n>0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
         if (rev == Original) {
            System.out.println("Palindrome number is : " + rev);
        }
        else{
            System.out.println("Not a palindrome number :" + Original);
        }

    }
// Sum of Digits number!
    public static void sumDig(int n){
        int original = n;
        int sum = 0;
        while (n>0) {
            int lastDig = n % 10;
            sum = sum + lastDig;
            n = n/10;
        }
        System.out.println("Sum of " + original + " Digit is = " + sum);
    }

    public static void main(String[] args) {
        sumDig(35489);
    }
}
