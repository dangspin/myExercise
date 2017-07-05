// This is a very easy problem, the core idea is to use the greedy algorithm to find local minimum and maximum and the difference
// is the profit for this local section. Then loop over all the sections.

public static int maxProfit(int[] prices) {
        if (prices==null){return 0;}
        
        int len=prices.length;
        
        int profit=0;
        for (int i=0;i<len;){
            int j=i+1;
            while (j<len && prices[j]-prices[j-1]>=0){
                profit=profit+prices[j]-prices[j-1];
                System.out.println(profit);
                j++;
            }
            i=j;
        }
        
        return profit;
    }
