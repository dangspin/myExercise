class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        // This is the same as the climbing stairs problem!
        
        int n = cost.length;
        
        int[] costs = new int[n+1];
        costs[0] = 0;
        costs[1] = 0;
        
        for (int i = 2; i <= n; i++) {
            costs[i] = Math.min(costs[i-1] + cost[i-1], costs[i-2] + cost[i-2]);
        }
        
        return costs[n];
    }
}
