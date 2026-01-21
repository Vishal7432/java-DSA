package Greedy_Approach;

public class Knapsack_Fractional {
    public static void main(String[] args) {

        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };

        int capacity = 50;
        double profit = 0;

        for (int i = 0; i < value.length; i++) {

            if (capacity >= weight[i]) {
                // full item le lo
                capacity -= weight[i];
                profit += value[i];
            } else {
                // fraction le lo
                profit += (double) value[i] * capacity / weight[i];
                break;
            }
        }
        System.out.println("Maximum Profit = " + profit);

    }
}
