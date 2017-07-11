public class Solution {
    /**
     * @param s: A string s
     * @param dict: A dictionary of words dict
     */
    public boolean wordBreak(String s, Set<String> dict) {
        // write your code here
        
        // This is a recursive version of the problem. It is very easy to implement and think, but hard to solve the problem efficiently
        if (s==null || s.length()==0){return true;}
        
        if (dict.contains(s)){return true;}
        
        for (int i=1;i<=s.length();i++){
            if (dict.contains(s.substring(0,i))){
                return wordBreak(s.substring(i,s.length()),dict);
            }
        }
        
        
        return false;
    }
}
