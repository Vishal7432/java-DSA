package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_FirstK_Ele_Queue {
    public static void reverseFirstKElement(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();

        // Step 1: first k elements stack me daalo
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }

        // Step 2: stack se wapas queue me daalo
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Step 3: remaining elements ko piche shift karo
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        int k = 5;
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        reverseFirstKElement(q, k);

        while (!q.isEmpty()) {
            System.out.print(" " + q.remove());
        }
        System.out.println();
    }
}
