import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Job_Sequncing {
    static class job {
        int deadline;
        int profit;
        int id; // 0(A), 1(B), 2(C),

        public job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {

        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // Collections.sort(jobs, (a, b) -> a.profit - b.profit); // Ascending order
        // main sort hoga
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); // Decending order main sort hoga

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            job curr = jobs.get(i);

            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        // Print seq
        System.out.println("Max jobs = " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
        System.out.println();

    }
}