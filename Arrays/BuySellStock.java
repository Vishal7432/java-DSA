package Arrays;

public class BuySellStock {

    public static int buySellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if (buyPrice < prices[i]) {     /// Profit taking case 1
                int profit = prices[i] - buyPrice;  // todays profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                 buyPrice = prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
         System.out.println(buySellStock(prices));
    }
}
