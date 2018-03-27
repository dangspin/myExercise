class Solution {
    public boolean judgeCircle(String moves) {
        int[] cor = {0, 0};
        
        for (char c: moves.toCharArray()) {
            if (c == 'L') {
                cor[0]--;
            } 
            
            if (c == 'R') {
                cor[0]++;
            }
            
            if (c == 'U') {
                cor[1]++;
            }
            
            if (c == 'D') {
                cor[1]--;
            }
        }
        
        return (cor[0] == 0 && cor[1]==0);
        
    }
}
