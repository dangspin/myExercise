public class Solution {
    /** 
     *@param chars: The letter array you should sort by Case
     *@return: void
     */
    public void sortLetters(char[] chars) {
        //write your code here
        int s=0;
        int e=chars.length-1;
        
        char tmp;
        
        while (s<=e){
            while (s<=e && Character.isLowerCase(chars[s])){s=s+1;}
            while (s<=e && Character.isUpperCase(chars[e])){e=e-1;}
            if (s<=e){
                tmp=chars[s];
                chars[s]=chars[e];
                chars[e]=tmp;
            }
        }
    }
}
