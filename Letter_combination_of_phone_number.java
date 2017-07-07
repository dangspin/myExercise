public class Solution {
    /**
     * @param digits A digital string
     * @return all posible letter combinations
     */
    // Build a dictionary for handy use
    public Map<Character, char[]> map; 
     
     
    public ArrayList<String> letterCombinations(String digits) {
        // Write your code here
        ArrayList<String> res= new ArrayList<String>();
         
        if (digits == null || digits.equals("")) {
            return res;
        }
        
        map = new HashMap<Character, char[]>();
        map.put('0', new char[] {});
        map.put('1', new char[] {});
        map.put('2', new char[] { 'a', 'b', 'c' });
        map.put('3', new char[] { 'd', 'e', 'f' });
        map.put('4', new char[] { 'g', 'h', 'i' });
        map.put('5', new char[] { 'j', 'k', 'l' });
        map.put('6', new char[] { 'm', 'n', 'o' });
        map.put('7', new char[] { 'p', 'q', 'r', 's' });
        map.put('8', new char[] { 't', 'u', 'v'});
        map.put('9', new char[] { 'w', 'x', 'y', 'z' });

        
        help(res,"",digits);
        return res;
    }
    
    private void help(ArrayList<String> array, String ss, String digits){
        if (digits == null || digits.equals("")) {
            array.add(ss);
            return;
        }
        
        for (char lett:map.get(digits.charAt(0))){
            ss=ss+lett;
            help(array,ss,digits.substring(1));
            ss=ss.substring(0,ss.length()-1);
        }
    }
}
