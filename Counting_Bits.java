class Solution {
// This is a very naive implementation
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        
        for (int i = 1; i<= num; i++) {
            res[i] = numDigits(i);
        }
        
        return res;
    }
    
    public int numDigits(int num) {
        int count = 0;
        
        while (num > 0) {
            count = count+ (num & 1);
            num = num >> 1;
        }
        
        return count;
    }
    
    
    // DP solution, way much better
    public int[] countBits(int num) {
        int[] bits = new int[num + 1];    
    for(int i = 1; i <= num; i++){
        bits[i] = bits[i/2];
        if(i%2 == 1) bits[i]++; 
    }
    return bits;
    }
}
