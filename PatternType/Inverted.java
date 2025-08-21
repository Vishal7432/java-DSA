package PatternType;

public class Inverted {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int s = 1; s<=(5-i+1); s++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
