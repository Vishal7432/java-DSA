import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int OddSun = 0 , EvenSum = 0;

        for(int i = 0; i< n; i++){
            int element =sc.nextInt();
            if (element%2 == 1) { 
                OddSun += element;
            }
            else{ 
                EvenSum += element;
                }
        }
         System.out.println("Sum of Odd number : = " + OddSun + "  Sum of Even Number : = " + EvenSum);
    }
}
