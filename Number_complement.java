class Solution {
    public int findComplement(int num) {
        
        if (num == 0) {
            return 1;
        }
        
        int total = 0;
        int nn = num;
        while (num > 0) {
            num = num >> 1;
            total  = (total << 1) +1;
        }
        
        return total- nn;
        
    }
}
