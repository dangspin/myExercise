class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
    
    // Very very straightforward solution, just neet to pay attention to the corner case.
    
        if (timeSeries.length == 0) {return 0;}
        if (timeSeries.length == 1) {return duration;}
        
        int tot = 0;
        
        for (int i = 1; i < timeSeries.length; i++) {
            if ((timeSeries[i] - timeSeries[i-1]) > duration) {
                tot += duration;
            } else {
                tot += (timeSeries[i] - timeSeries[i-1]);
            }
        }
        
        return tot+duration;
    }
}
