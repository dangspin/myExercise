class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        // write your code here
        if (target==null || source==null){return -1;}
        
        int len1=source.length();
        int len2=target.length();
        
        for (int i=0;i<len1-len2+1;i++){
            int j=0;
            for (j=0;j<len2;j++){
                if (target.charAt(j)!=source.charAt(i+j)){
                    break;
                }
            }
            
            if (j==len2){
                return i;
            }
            
        }
        
        
        return -1;
        
    }
}
