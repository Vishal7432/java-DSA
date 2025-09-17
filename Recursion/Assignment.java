public class Assignment {

    // Problem 1
    // For a given integer array of size N.You have to find all the
    // occurrences(indices) of a given element(Key) and print them.
    // Use a recursive function to solve this problem

    public static void printAllOccurrences(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        printAllOccurrences(arr, key, i + 1);
    }

    // Question 3
    // Write a program to findLength of aStringusing Recursion.

    public static int lengthString(String str) {

        // baseCase
        if (str.length() == 0) {
            return 0;
        }

        // kaam
        return lengthString(str.substring(1)) + 1;
    }

    // Question -2
    // You are given a number (eg - 2019), convert it into a String of english
    // like“two zero one nine”. Use a recursive function to solve this
    // problem.NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t
    // be 0

    // static String digits[] = { "zero", "one", "two", "three", "four", "five",
    // "six", "seven", "eight", "nine" };

    public static void printDigits(int num, String digits[]) {
        // baseCase
        if (num == 0) {
            return;
        }

        int lastDigit = num % 10;

        printDigits(num / 10, digits);
        System.out.println(digits[lastDigit]);
    }

    // Question -4

    public static int countSubstrs(String str, int i, int j, int n) {

        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countSubstrs(str, i + 1, j, n - 1) + countSubstrs(str, i, j - 1, n - 1)
                - countSubstrs(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        // ans 1
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // int key = 2;
        // printAllOccurrences(arr, key, 0);

        // // ans 3
        // String str = "vishal";
        // System.out.println(lengthString(str));

        // ans 2
        // String digits[] = { "zero", "one", "two", "three", "four", "five", "six",
        // "seven", "eight", "nine" };
        // printDigits(2006, digits);

        // ans -4
        String str = "aba";

        int n = str.length();

        System.out.println(countSubstrs(str, 0, n - 1, n));
    }
}