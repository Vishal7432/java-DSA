package BitMunipulation;

public class CheckPower {
    public static boolean NumPowerTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(NumPowerTwo(8));
    }
}
