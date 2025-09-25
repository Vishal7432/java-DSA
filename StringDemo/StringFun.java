package StringDemo;

public class StringFun {

    public static String printString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void ptint(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println(str.length());

    }

    public static void main(String[] args) {
        String str = "1.4";
        ptint(str);
        // System.out.println(str.substring(0, 5));
        // System.out.println(printString(str, 3, 5));
    }
}
