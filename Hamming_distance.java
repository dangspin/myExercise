public class Solution {
    public int hammingDistance(int x, int y) {
         int xor=x^y;
         
         int res=0;
         while (xor!=0){
             // the logic computation has lower priority than sum;
             res=res+(xor&1);
             xor=xor>>1;
         }
         
         return res;
    }
}
