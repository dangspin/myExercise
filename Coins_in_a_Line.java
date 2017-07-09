public class Solution {
    /**
     * @param n: an integer
     * @return: a boolean which equals to true if the first player will win
     */
    
    private HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>(); 
    
    public boolean firstWillWin(int n) {
        // write your code here
        if (n==0){return false;}
        if (n<=2){return true;}
        
        boolean []res=new boolean[n+1];
        res[0]=false;
        res[1]=true;
        res[2]=true;
        
        for (int i=3;i<n+1;i++){
            res[i]=res[i-3];
        }
        
        return res[n];
    }
    
    
    // Memorization version, which is the implementation of recursive call
    public boolean firstWillWin(int n) {
        // write your code here
        if (n<=0){
            return false;
        }
        if (n>=1 && n<=2){
            return true;
        }
        else {
            if (!map.containsKey(n)){
                boolean win=(!firstWillWin(n-1) || !firstWillWin(n-2));
                map.put(n,win);
            }
        
            return (boolean)map.get(n);
        }
        
    }
}

//For this problem, there is a greedy way solution. For example, if I have 6 coins, in order to win, I need to be the first the get 6-3 conis
//, but this is impossible.
