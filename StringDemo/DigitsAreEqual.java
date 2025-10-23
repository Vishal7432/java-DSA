package StringDemo;

public class DigitsAreEqual {
    // Check If Digits Are Equal in String After Operations I,Leetcode 3441.
    public static boolean hasSameDigit(String str) {

        while (str.length() > 2) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < str.length() - 1; i++) {
                int a = str.charAt(i) - '0'; // Characters '0' se '9' ke ASCII (Unicode) codes continuous hote hain.
                int b = str.charAt(i + 1) - '0';
                next.append((a + b) % 10);
            }
            str = next.toString();
        }
        return str.charAt(0) == str.charAt(1);

    }

    public static void main(String[] args) {
        String str = "3902";
        System.out.println(hasSameDigit(str));
    }
}

// Character ASCII Code
// '0' 48
// '1' 49
// '2' 50
// '3' 51
// '4' 52
// '5' 53
// '6' 54
// '7' 55
// '8' 56
// '9' 57

// So agar tum '3' - '0' karte ho → 51 - 48 = 3 😃
// 👉 matlab character '3' number 3 ban gaya.