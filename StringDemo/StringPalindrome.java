package StringDemo;

/// find length of string wituthout using library function
public class StringPalindrome {

    public static boolean palindromeString(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // mismatch mila toh palindrome nahi
            }
            i++;
            j--;
        }
        return true; // agar pura loop chal gaya toh palindrome hai
    }

    public static void main(String[] args) {
        String str = "aabaa";
        System.out.println(palindromeString(str)); // true
    }

    /// 3 Stringbuilder 
    public static boolean palindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    // 2

    public static boolean String(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

}
