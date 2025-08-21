import java.util.Scanner;


public class JavaBacis {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.err.println(n);

        }
        while(true);



    //    int n = 10899;
    //    int rev = 0;
    //     while (n > 0 ) {
    //         int lastdigit = n%10;
    //         rev = (rev * 10) + lastdigit;
    //         n = n/10;
    //     }

    //     System.out.println("Reverse number is : " + rev);


       
    //    while (n>0) {
    //     int lastdigit = n%10;
    //     System.out.print(lastdigit);
    //     n = n/10;
    //    }
    //    System.out.println();


        // int marks = sc.nextInt();
    
        // String RC = (marks > 33)? "Student is pass": "Student is Fail.";
        // System.out.println(RC);


        // int income = sc.nextInt();
        //  int tax;

        //  if(income<500000){
        //     tax = 0;
        //  }
        //  else if (income>500000 && income<100000) {
        //     tax =  (int)(income * 0.2);
        //  }
        //  else {
        //     tax = (int) (income * 0.3);
        //  }
        //  System.out.println("Your tax is : " + tax);



        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();

        // float total = pencil + pen + eraser;

        // System.out.println("Bill is : " + total);
        
        // // Add on - with  18% TAX

        // float newTotal = total + (0.18f * total);

        // System.out.println("Include GST with 18% : " + newTotal);
        // System.out.println("Total amount is : " + newTotal + " Rupees");

        // int $ = 24;
        // System.out.print($);
        
    }
}
// Boilerplate code
