class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] days = new int[temperatures.length];
        
        for (int i = 0; i < days.length; i++) {
            days[i] = findIndx(temperatures, i+1, days.length-1, i);
        }
        
        return days;
    }
    
    public int findIndx(int[] temperatures, int start, int end, int target) {
        if (start > end) {
            return 0;
        }
        
        for (int i = start; i <= end; i++) {
            if (temperatures[i] > temperatures[target]) {
                return (i - target);
            }
        }
        
        return 0;
    }
}
