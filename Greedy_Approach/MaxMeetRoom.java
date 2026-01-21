package Greedy_Approach;

import java.util.Arrays;

public class MaxMeetRoom {
    public static void main(String[] args) {
        int strart[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int n = strart.length;

        int meetings[][] = new int[n][2];

        // Step 1: store start & end
        for (int i = 0; i < n; i++) {
            meetings[i][0] = strart[i];
            meetings[i][1] = end[i];
        }

        // Step 2: sort by end time
        Arrays.sort(meetings, (a, b) -> a[1] - b[1]);

        int count = 1;
        int lastEnd = meetings[0][1];

        for (int i = 1; i < n; i++) {
            if (meetings[i][0] >= lastEnd) {
                count++;
                lastEnd = meetings[i][1];
            }
        }

        System.out.println("Maximum meetings = " + count);
    }
}
