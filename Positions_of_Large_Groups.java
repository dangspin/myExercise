class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
    
    // Very easy solution, just need to be careful about the corner case, which the repeated pattern will be the string itself!
        ArrayList<List<Integer>> res = new ArrayList<>();
        
        int count = 1;
        int st = 0;
        
        for (int i = 1; i < S.length(); i++) {
            char c = S.charAt(i);
            char t = S.charAt(st);
            
            if (c == t) {
                count++;
            } else {
                if (count >= 3) {
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(0,i-1);
                    tmp.add(0, st);
                    res.add(tmp);
                }
                count = 1;
                st = i;
            }
        }
        
        if (count >= 3) {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            tmp.add(0, S.length()-1);
            tmp.add(0, st);
            res.add(tmp);
        }
        
        return res;
    }
}
