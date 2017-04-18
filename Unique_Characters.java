public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        // write your code here
        char[] target=str.toCharArray();
        
        Arrays.sort(target);
        
        for (int i=1;i<target.length-1;i++){
            if (target[i]==target[i-1]){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean isUnique(String str){
        if (str.length()<=1){return true;}
        else{
            for (int i=0;i<str.length();i++){
                for (int j=0;j<i;j++){
                    if (str.charAt(j)==str.charAt(i)){
                        return false;
                    }
                }
            }
            
            return true;
        }
    }
}
