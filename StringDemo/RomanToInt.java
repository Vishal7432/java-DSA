package StringDemo;

import java.util.*;

public class RomanToInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));

            if (i + 1 < s.length() && value < map.get(s.charAt(i + 1))) {
                result -= value; // subtraction case
            } else {
                result += value; // normal addition
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMIV")); // 1904
        System.out.println(romanToInt("IV")); // 9
        System.out.println(romanToInt("LVIII")); // 58
    }
}
