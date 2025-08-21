package PatternType;

public class HalfPyra {

    // Inverted half pyramid with number

    public static void Inverted(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        } 
    }
    public static void main(String[] args){
        // for(int line = 1; line<=5; line++) {
        //     for(int num = 1; num<=line; num++){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }

        Inverted(6);
    }
}
