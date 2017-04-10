// This is the first solution, use the while loop. The solution is very straightfoward.

public class Solution {
    /**
     * @param num a non-negative integer
     * @return one digit
     */
    public int addDigits(int num) {
        // Write your code here
        if (num/10==0){return num;}
        else{
            while (num/10>0){
                int sum=0;
                while (num>0){
                    sum=sum+num%10;
                    num=num/10;
                }
                num=sum;
            }
            
            return num;
        }
    }
}




// Solution version 2:
