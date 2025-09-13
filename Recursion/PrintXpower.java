

public class PrintXpower {

    public static int XPower(int x, int n) {

        if (n == 0) {
            return 1;
        }

        int xnm1 = XPower(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static int optimizedPower(int a, int n) {

        if (n == 0) {
            return 1;
        }

        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is Odd number
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optimizedPower(a, n));
    }
}