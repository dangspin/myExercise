public class Solution {
    public static int maxProfit(int[] prices) {
    // This is a really interesting problem. The core idea is dynamic programming.
    // we need to transaction state, buy and sell.
    
    // buy[i] is the total profit we can get till i. So the first day, we have a negative profit.(Only buying and no selling)
    // sell[i] is the total profit we can get till i. So the first day, we have zero profit. (There is no way to sell stock before buy)
    
    // Remember our constrain is we can only do one thing per day.
    
    // One the second day, it is possible to make a whole transaction (both buying and selling). and this day need to be considered seperately
    // The for the rest of day, we just need equatino to describe the transfer of states.
    
        if (prices==null || prices.length<=1){return 0;}
        
        int len=prices.length;
        
        int[] buy=new int[len];
        int[] sell=new int[len];
        
        buy[0]=-prices[0];
        buy[1]=prices[0]<prices[1]?-prices[0]:-prices[1];
        sell[0]=0;
        sell[1]=Math.max(sell[0],buy[0]+prices[1]);
        
        for (int i=2;i<len;i++){
            buy[i]=Math.max(buy[i-1],sell[i-2]-prices[i]);
            
            sell[i]=Math.max(sell[i-1],buy[i-1]+prices[i]);
        }
        
        int res=sell[len-1]>0? sell[len-1]:0;
        return res;
    }
}
