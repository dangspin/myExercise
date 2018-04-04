class Solution {
    
    String[] keys = {"qwertyuiop","asdfghjkl","zxcvbnm"};
    
    public String[] findWords(String[] words) {
        
        ArrayList<String> res = new ArrayList<String>();
        
        for (String str : words) {
            int row = findRow(str.toLowerCase().charAt(0));
            
            boolean yes = true;
            
            for (char c : str.toLowerCase().toCharArray()) {
                if (findRow(c) != row) {
                    yes = false;
                    break;
                }
            }
            
            if (yes) {
                res.add(str);
            }
        }
        
        return res.toArray(new String[res.size()]);
        
    }
    
    public int findRow(char c) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].indexOf(c) != -1) {
                return i;
            }
        }
        
        return -1;
    }
}
