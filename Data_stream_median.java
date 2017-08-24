public class Solution {
    /*
     * @param nums: A list of integers
     * @return: the median of numbers
     */
     
    PriorityQueue<Integer> maxpq;
    PriorityQueue<Integer> minpq;
     
    public int[] medianII(int[] nums) {
        // write your code here
        
        maxpq=new PriorityQueue<Integer>(new Comparator<Integer> () {
    public int compare(Integer a, Integer b) {
       return b - a;
    }
  });
        minpq=new PriorityQueue<Integer>();
        
        int[] res=new int[nums.length];
        
        for (int i=0;i<nums.length;i++){
            addNumber(nums[i]);
            res[i]=get();
        }
        
        return res;
        
    }
    
    public void addNumber(int n){
        maxpq.offer(n);
        
        if (maxpq.size()-minpq.size()>1){
            minpq.offer(maxpq.poll());
        }else if (minpq.size()>0 && maxpq.size()-minpq.size()==1){
            int maxtop=maxpq.peek();
            int mintop=minpq.peek();
            
            if (maxtop>mintop){
                maxtop=maxpq.poll();
                mintop=minpq.poll();
                maxpq.offer(mintop);
                minpq.offer(maxtop);
            }
        }
    }
    
    public int get(){
        return maxpq.peek();
    }
    
}
