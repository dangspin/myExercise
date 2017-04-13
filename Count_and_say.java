public class Solution {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public String countAndSay(int n) {
        // Write your code here
        
        // I use dynamic programming, since there is no math relation between different numbers. so DP is a good method.
        // The only point is how to manipulate the string
        if (n<=1){return "1";}
        else{
            String[] sarray=new String[n+1];
            sarray[0]="1";
            sarray[1]="1";
            
            for (int i=2;i<=n;i++){
                sarray[i]=help(sarray[i-1]);
            }
            
            return sarray[n];
        }
    }
    
    public String help(String num){
        StringBuilder sb = new StringBuilder();
        
        int count=1;
        for (int j=0;j<num.length();j++){
            if (j<num.length()-1 && num.charAt(j)==num.charAt(j+1) ){
                count=count+1;
            }else{
                sb.append(String.valueOf(count) + String.valueOf(num.charAt(j)));
                count=1;
            }
        }
        
        return sb.toString();
    }
}
