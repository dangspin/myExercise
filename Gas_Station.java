public class Solution {
    /**
     * @param gas: an array of integers
     * @param cost: an array of integers
     * @return: an integer
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // write your code here
        if (gas.length==0 || cost.length==0){return -1;}
        else{
            
            int left=0;
            int total=0;
            int start=-1;
            
            for (int i=0;i<gas.length;i++){
                left=left+gas[i]-cost[i];
                total=total+gas[i]-cost[i];
                
                if (left<0){
                    start=i;
                    left=0;
                }
            }
            
            if (total<0){
                return -1;
            }else{
                return start+1;
            }
            
            
        }
    }
}

// This problem is really interesting. This is about greedy algorithm, so we use total as the net gas the car left after moving around
// a circle, then if total>=0, there is always a solution for us!! Because the car is moving along a circle, so that we can rearrange
// the starting point. Then the task left is figure out how to pick up the initial point. This is done by the truth that if we have a net 
// consumption at each stage less than zero, just set this point as begining and net is zero.
