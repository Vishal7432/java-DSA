package Stack;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreatest[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2 if-else
            if (s.isEmpty()) {
                nextGreatest[i] = -1;
            } else {
                nextGreatest[i] = arr[s.peek()];
            }

            // 3 Push in stack ith
            s.push(i);
        }

        for (int i = 0; i < nextGreatest.length; i++) {
            System.out.print(nextGreatest[i] + " ");
        }
        System.out.println();
    }
}
// Question variation
// next Greater right
// next Greater left
// next Smaller right
// next Smaller left