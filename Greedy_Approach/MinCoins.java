package Greedy_Approach;

public class MinCoins {
    public static void main(String[] args) {

        int coins[] = { 10, 5, 2, 1 };
        int price = 18;

        int minCoins = 0;

        for (int i = 0; i < coins.length; i++) {

            while (price >= coins[i]) {
                price = price - coins[i];
                minCoins++;
            }
        }
        System.out.println("Minimum coins taking = " + minCoins);
    }
}
