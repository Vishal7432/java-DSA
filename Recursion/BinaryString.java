public class BinaryString {
    // Binary String Problem
    // print all binary string of size n without consecutive ones.

    public static void printBinaryway(int n, int lastPlace, String str) {
        // BaseCase
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        // if (lastPlace == 0) {
        // // sit 0 on chair n
        // printBinaryway(n - 1, 0, str.append("0"));
        // printBinaryway(n - 1, 1, str.append("1"));
        // } else {
        // // sit 1 on chairn
        // printBinaryway(n - 1, 0, str.append("0"));
        // }

        // better code
        printBinaryway(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinaryway(n - 1, 1, str + "1");

        }

    }

    // consecutive zero.
    public static void forZeroBinary(int n, int lastPlace, String str) {
        // BaseCase
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        forZeroBinary(n - 1, 1, str + "1");
        if (lastPlace == 1) {
            forZeroBinary(n - 1, 0, str + "0");

        }

    }

    public static void main(String[] args) {
        int n = 3;
        // printBinaryway(n, 0, " ");
        forZeroBinary(n, 1, " ");
    }
}