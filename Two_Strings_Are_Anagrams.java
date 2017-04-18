public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        if (s.length()!=t.length()){return false;}
        else{
            for (int i=0;i<s.length();i++){
                if (map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }else{
                    map.put(s.charAt(i),1);
                }
            }
            
            for (int j=0;j<s.length();j++){
                if (map.containsKey(t.charAt(j))){
                    map.put(t.charAt(j),map.get(t.charAt(j))-1);
                }
            }
            
            for (Character c:map.keySet()){
                if (map.get(c)!=0){
                    return false;
                }
            }
            
            return true;
            
        }
    }
}
