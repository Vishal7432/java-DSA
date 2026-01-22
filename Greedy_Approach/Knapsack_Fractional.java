package Greedy_Approach;

import java.util.Arrays;
// import java.lang.reflect.Array;
import java.util.Comparator;

public class Knapsack_Fractional {
    public static void main(String[] args) {

        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 30, 20 };
        int w = 50;

        // int capacity = 50;
        // double profit = 0;

        // for (int i = 0; i < value.length; i++) {

        // if (capacity >= weight[i]) {
        // // full item le lo
        // capacity -= weight[i];
        // profit += value[i];
        // } else {
        // // fraction le lo
        // profit += (double) value[i] * capacity / weight[i];
        // break;
        // }
        // }
        // System.out.println("Maximum Profit = " + profit);

        double ratio[][] = new double[value.length][2];
        // 0th col => idx ; 1st col => ratio;

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        // Accending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalVal = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {

            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) { // include full item
                finalVal += value[idx];
                capacity -= weight[idx];
            } else {
                // Include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final Value = " + finalVal);
    }
}
