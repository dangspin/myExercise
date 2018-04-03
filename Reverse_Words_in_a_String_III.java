class Solution {
    public String reverseWords(String s) {
        String[] sa = s.split(" ");
        
        for (int i= 0; i < sa.length; i++) {
            sa[i] = new StringBuilder(sa[i]).reverse().toString();
        }
        
        StringBuilder result = new StringBuilder();
        for (String str: sa) {
            result.append(str + " ");
        }
        
        return result.toString().substring(0, result.length()-1);
    }
}
