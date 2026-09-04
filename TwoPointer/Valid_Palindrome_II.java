package TwoPointer;

public class Valid_Palindrome_II {
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // brute force methods
    // public boolean isValidPalindrome(String s) {
    // for (int i = 0; i < s.length(); i++) {

    // StringBuilder sb = new StringBuilder();

    // // i-th character ko skip karo
    // for (int j = 0; j < s.length(); j++) {

    // if (i == j) {
    // continue;
    // }

    // sb.append(s.charAt(j));
    // }

    // String newStr = sb.toString();

    // if (isPalindrome(newStr, 0, newStr.length() - 1)) {
    // return true;
    // }
    // }
    // return false;
    // }

    public boolean isValidPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {

                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "acba";
        System.out.println(new Valid_Palindrome_II().isValidPalindrome(s));
    }

}