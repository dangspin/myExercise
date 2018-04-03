class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        
        int tot = 0;
        for (int i = 0; i < S.length(); i++) {
            tot = tot + widths[S.charAt(i)-'a'];
        }
        
        int[] res = new int[2];
        int subt = 0;
        
        for (int i = 0; i < S.length(); i++) {
            if ((subt+ widths[S.charAt(i)-'a']) <=100) {
                subt = subt+widths[S.charAt(i)-'a'];
            } else {
                tot = tot - subt;
                subt = widths[S.charAt(i)-'a'];
                res[0]++;
            }
        }
        
        res[0]++;
        res[1] = tot;
        
        return res;
    }
}
