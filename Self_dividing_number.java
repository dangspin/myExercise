class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        
        for (int i = left; i <= right; i++) {
            if (isSelf(i)) {
                res.add(i);
            }
        }
        
        return res;
    }
    
    public boolean isSelf(int num) {
        int cur = num;
        
        while (cur > 0) {
            int res = cur%10;
            cur = cur/10;
            
            if (res == 0) {
                return false;
            } else {
                if (num % res !=0) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
