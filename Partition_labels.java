class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<Integer> ();
        
        int i = 0;
        
        while (i < S.length()) {
            
            int stIndex = i;
            int endIndex = findLast(S, S.charAt(i));
            
            for (int j = stIndex + 1; j < endIndex; j++) {
                if (findLast(S, S.charAt(j)) > endIndex) {
                    endIndex = findLast(S, S.charAt(j));
                }
            }
            
            res.add(endIndex-stIndex+1);
            
            i = endIndex +1;
        }
        
        return res;
    }
    
    public int findLast(String S, char target) {
        for (int i = S.length()-1; i >=0; i--) {
            if (S.charAt(i) == target) {
                return i;
            }
        }
        
        return -1;
    }
}
