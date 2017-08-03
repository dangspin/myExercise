public class Solution {
    
    public HashMap<Character,char[]> map;
    
    public List<String> letterCombinations(String digits) {
        
        List<String> res=new ArrayList<String>();
        
        if (digits.length()<=0){return res;}
        
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
        
        build(digits,res,"");
        return res;
    }
    
    public void build(String digits, List<String> res, String tmp){
        if (digits.equals("")){
            res.add(tmp);
            return ;
        }
        
        for (char c: map.get(digits.charAt(0))){
            tmp=tmp+c;
            build(digits.substring(1),res,tmp);
            tmp=tmp.substring(0,tmp.length()-1);
        }
    }
}
