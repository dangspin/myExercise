// The basic idea is build a word vector a_vector for string A, and count the appearence of each characters. 
// Then, substract it by the appearence in String B. if there is one vector components less than zero, return false.


public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if (B.length()==0){
            return true;
        }else{
            int[] a_vector=new int[26];
            
            // Built the word vector for a
            for (int i=0;i<A.length();i++){
                int index=A.charAt(i)-'A';
                a_vector[index]=a_vector[index]+1;
            }
            
            for (int j=0;j<B.length();j++){
                int bindex=B.charAt(j)-'A';
                a_vector[bindex]=a_vector[bindex]-1;
                if ((a_vector[bindex])<0){
                    return false;
                }
            }
            
            return true;
        }
    }
}
