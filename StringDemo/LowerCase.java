package StringDemo;

import java.util.Scanner;

public class LowerCase {

    public static boolean isVowels(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static int countLowerCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowels(ch)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Words :");
        String str = sc.nextLine();

        int vowelCount = countLowerCase(str);
        System.out.println("total vowels is our String = " + vowelCount);

    }
}