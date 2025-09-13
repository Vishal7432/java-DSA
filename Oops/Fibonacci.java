package Oops;

public class Fibonacci {

    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int fbn1 = fibonacci(n - 1);
        int fbn2 = fibonacci(n - 2);
        int fibn = fbn1 + fbn2;
        return fibn;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fibonacci(n));
    }
}