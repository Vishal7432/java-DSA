package Greedy_Approach;

public class Max_Balance_String {
    public static void main(String[] args) {

        String str = "LRRRRLLRLLRL";
        int L = 0, R = 0;
        int Count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // (ch == 'L') ? L++ : R++; // ✅
            if (ch == 'L') {
                L++;
            } else {
                R++;
            }

            if (L == R) {
                Count++;
            }
        }
        System.out.println("Maximum Balanced String = " + Count);

    }
}
