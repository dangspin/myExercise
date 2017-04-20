public class Solution {
    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // Write your code here
        if (s.length()==0 || s==null){return true;}
        
        int start=0;
        int end=s.length()-1;
        
        
        while (start<end){
            while (start<s.length() && !isAlphanumeric(s.charAt(start))){
                start++;
            }
            
            if (start == s.length()) {
                return true;   //This line is really important, it deal with the case if there is no useful letter in the string!
            }
            
            while (end<s.length() && !isAlphanumeric(s.charAt(end))){
                end--;
            }
            
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                break;
            }else{
                start++;
                end--;
            }
            
        }
        
        return end<=start;
        
    }
    
    
    private boolean isAlphanumeric (char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}
