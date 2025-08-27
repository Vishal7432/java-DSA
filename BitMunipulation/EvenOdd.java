package BitMunipulation;

public class EvenOdd {

    public static void oddOrEven(int n) {
        int BitMask = 1;
        if ((n & BitMask) == 0) {
            System.out.println("even Number");
        } else {
            System.out.println("odd Number");
        }
    }

    public static int getBit(int n, int i) {
        int BitMask = 1 << i;
        if ((n & BitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int n, int i) {
        int BitMask = 1 << i;
        return n | BitMask;
    }

    public static int clearBit(int n, int i) {
        int BitMask = ~(1 << i);
        return n & BitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearBit(n, i);
        // }else{
        // return setBit(n, i)
        // }

        n = clearBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    public static void main(String[] args) {
        // oddOrEven(3);
        // oddOrEven(8);
        // oddOrEven(9);
        System.out.println(updateIthBit(10, 2, 1));
    }
}
