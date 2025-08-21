package PatternType;

public class Charcter {
    public static void main(String[] args) {

        int n = 4;
        char ch = 'A';

        // Outer loop
        for (int line = 1; line<= n; line++){
            for(int chars = 1; chars<= line; chars++){
            System.out.print(ch);
            ch++;
            }
          System.out.println(" ");


        }
        
    }
}
// Output
//    A
//    B C 
//    D E F 
//    G H I J