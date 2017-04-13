class Solution {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        // This problem is intersing. the basic idea is that the XOR will convert 1-0 pair to 1, 0-0 pair and 1-1 pair to 0,
        // Then the problem is count 1!! as we did before. But we need to constrain 32 bits total.
        int count=0;
        
        int xor=a^b;
        int number=32;
        while (number>0){
            if ((xor&1)==1){
                count=count+1;
            }
            xor=xor>>1;
            number=number-1;
        }
        return count;
        
    }
};
