public class Solution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        // write your code here
        // Here since the problem restrict the bit is 32, we just need to loop it over 32 times
        int count=0;
        for (int i=0;i<32;i++){
            if ((num&(1<<i))!=0){
                count=count+1;
            }
        }
        return count;
    }
    
    public int countOnes(int num) {
        // write your code here
        int count=0;
        while (num!=0){ // This must be !=0, because we are also considering negative numbers!!!
            num=num&(num-1);
            count++;
        }
        return count;
    }
    
};
