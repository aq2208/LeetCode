package BestTimeToBuyAndSellStock;

public class MaxProfit {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int timeToBuy = 0;  //Find Min
        int timeToSell = timeToBuy + 1;  //Find Max
        int currentProfit = 0;

        while (timeToBuy <= timeToSell) {
            currentProfit = prices[timeToSell] - prices[timeToBuy];

            if(prices[timeToSell] <= prices[timeToBuy]) {
                timeToBuy = timeToSell;
                timeToSell++;
            }
            if(prices[timeToSell + 1] >= prices[timeToSell]) {
                timeToSell++;
            }
        }

        return 0;
    }
}
