package BitMunipulation;

public class Assignment {
    public static int valueOfX(int x) {
        int value = x ^ x;
        return value;
    }

    public static void isSwap(int a, int b) {

        // Swap two number without third variable
        System.out.println("Before swap: a = " + a + " and b = " + b);

        // Swap using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: a = " + a + " and b = " + b);

    }

    // Add 1 in number using bitMunipualation
    public static int addOne(int n) {
        return -~(n);
    }

    public static void main(String[] args) {
        // System.out.println(valueOfX(5));

        // int a = 5;
        // int b = 3;
        // isSwap(a, b);

        // System.out.println(addOne(5));

        // Convert uppercase character to lowercase

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char) (ch | ' '));
            // prints abcdefghijklmnopqrstuvwxyz}}

        }

    }

}
