package PatternType;

public class Floyd {


    public static void FloydNum(int n ){
        int couter = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(couter + " ");
                couter++;
            }
            System.out.println("  ");
        }
    }

    public static void main(String[] args) {
        FloydNum(5);
    }
}
