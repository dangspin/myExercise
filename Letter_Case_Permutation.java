class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<String> ();
        
        findString(res, S, "", 0);
        return res;
    }
    
    public void findString(List<String> res, String S, String ss, int index) {
        if (index >= S.length() ) {
            res.add(ss);
            return;
        }
        
        char c = S.charAt(index);
        if (Character.isLetter(c)) {
            findString(res, S, ss+Character.toLowerCase(c), index+1);
            findString(res, S, ss+Character.toUpperCase(c), index +1);
        } else {
            findString(res, S, ss+c, index+1);
        }
    }
}
