package PatternType;

public class Pattern {
    public static void main(String[] args) {
        // for(int line = 1; line <= 4; line++) {
        //     for(int star = 1; star <= line; star++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }


        // Rotated half pyramid ..
        int n = 5;
          for(int i = 1; i <= n; i++) {

            // int space = n-i, star = i;

            //spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            // Star 
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
