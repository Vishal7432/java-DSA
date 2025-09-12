public class SumN {

    public static int sumN(int n) {

        if (n == 1) {
            return 1;

        }
        int fn = sumN(n - 1);
        int sum = n + sumN(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumN(n));
    }
}
