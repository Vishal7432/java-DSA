package StringDemo;

public class StringPolindrome {

    public static boolean polindromeString(String str) {

        int j = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(j)) {
                j--;
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        String str = "aabaa";
        System.out.println(polindromeString(str));
    }
}