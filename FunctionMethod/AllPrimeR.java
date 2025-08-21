package FunctionMethod;

public class AllPrimeR {

    // Only for n >= 2
    public static boolean isPrime(int n){
        //corner case
        //2

        if (n == 2) {
            return true;
        }
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {  // completety dividing.
               isPrime = false; 
               break;
            }
            
        }   

        return isPrime;
    }

    public static void primesInRange(int n){
        for(int i = 2; i<=n; i++){
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        primesInRange(5);
        
    }
}
