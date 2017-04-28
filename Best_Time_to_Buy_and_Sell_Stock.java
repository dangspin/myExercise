public class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        // brute force
        
        int max=0;
        
        for (int i=0;i<prices.length;i++){
            for (int j=i+1;j<prices.length;j++){
                int current=prices[j]-prices[i];
                max=Math.max(max,current);
            }
        }
        return max;
    }
    
    public int maxProfit(int[] prices) {
        // write your code here
        // better method
        if (prices == null || prices.length <= 1) return 0;
        
        int res=Integer.MAX_VALUE;
        int profit=0;
        
        for (int i=0;i<prices.length;i++){
            profit=Math.max(profit,prices[i]-res);
            res=Math.min(prices[i],res);
        }
        
        return profit;
    }
}
