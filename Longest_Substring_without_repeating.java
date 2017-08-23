public class Solution {
    /*
     * @param s: a string
     * @return: an integer
     */
    public int lengthOfLongestSubstring(String s) {
        // write your code here
        if (s.length()==0){return 0;}
        
        HashSet<Character> set=new HashSet<Character>();
        
        int res=0;
        
        int i=0;
        for (int j=0;j<s.length();j++){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                res=Math.max(res,j-i+1);
            }else{
                while (i<=j && set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));
            }
        }
        
        return res;
    }
}
