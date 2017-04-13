public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        String res="";
        if (strs.length==0){return res;}
        else{
            String test=strs[0];
            
            for (int i=1;i<strs.length;i++){
                int j=0;
                if (strs[i].length()!=0){
                    while (j<test.length() && strs[i].charAt(j)==test.charAt(j)){
                        j=j+1;
                    }
                    test=test.substring(0,j);
                }else{
                    return res;
                }
                
            }
            
            return test;
        }
    }
}

// For this problem, since we are looking at the prefix, so that we can just start the loop without considering the DP method
// However, there is one thing we must be careful, that is, if there is an empty string, we can return it immediatly.
