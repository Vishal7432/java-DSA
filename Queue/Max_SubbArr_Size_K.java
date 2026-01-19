package Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Max_SubbArr_Size_K {

    public static ArrayList<Integer> maxSubbArrs(int arr[], int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // 1. Remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.removeLast();
            }

            // 2. Remove elements out of this window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // 3. Add current index
            dq.addLast(i);

            // 4. Window complete hone par answer
            if (i >= k - 1) {
                ans.add(arr[dq.peekFirst()]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        System.out.println(maxSubbArrs(arr, k));
    }
}
