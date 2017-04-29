public class Solution {
    /**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(String s) {
        // Write your code here
        if (s.length()==0){return 0;}
        
        
        char[] string=s.toCharArray();
        
        int length=0;
        
        for (int i=string.length-1;i>=0;i--){
            if (string[i]!=' '){
                length++;
            }else if (string[i]==' '){
                if (i!=string.length-1){
                    break;
                }else{
                    continue;
                }
            }
        }
        
        
        
        return length;
    }
}

// This problem is very very straightforward, but the trick is, in order to figure that out as soon as possible, it is better to 
// start from the end of the string
