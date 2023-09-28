import java.util.*;

class Solution{
    public int MaxProfit(int [] prices){
        if(prices.length==0){
            return 0;
        }
        int min = prices[0];
        int max = 0;
        int profit = 0;

        for(int stockprices:prices){
            min = Math.min(min, stockprices);
            profit = stockprices-min;
            max = Math.max(profit, max);

        }
        return max;
    }
}