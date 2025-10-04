
public class FindSubset {
    public static void findSubset(String str, String ans, int i) {
        // basecase
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursion
        // yes choise
        findSubset(str, ans + str.charAt(i), i + 1);
        // No choise
        findSubset(str, ans, i + 1);

    }

    public static void ByStringBuilder(String str, StringBuilder ans, int i) {
        // basecase
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // include current character (yes choice)
        ans.append(str.charAt(i));
        ByStringBuilder(str, ans, i + 1);

        // backtrack (remove last added character)
        ans.deleteCharAt(ans.length() - 1);

        // exclude current character (no choice)
        ByStringBuilder(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        // findSubset(str, "", 0);
        ByStringBuilder(str, new StringBuilder(), 0);
    }
}
