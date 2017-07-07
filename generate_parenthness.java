public class Solution {
    /**
     * @param n n pairs
     * @return All combinations of well-formed parentheses
     */
    public ArrayList<String> generateParenthesis(int n) {
        // Write your code here
        ArrayList<String> array=new ArrayList<String>();
        if (n==0){return array;}
        
        help(array,"",n,n);
        
        return array;
    }
    
    private void help(ArrayList<String> array, String ss, int left, int right){
        if (left==0 && right==0){
            array.add(ss);
            return;
        }
        
        if (left>0){
            help(array,ss+"(",left-1,right);
        }
        if (right >0 && left<right){
            help(array,ss+")",left,right-1);
        }
        
    }
}
