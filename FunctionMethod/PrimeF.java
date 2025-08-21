package FunctionMethod;

public class PrimeF {

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


    public static void main(String[] args) {
       
        System.out.println("number is prime :" +  isPrime(9) );
    }
}
