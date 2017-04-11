public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
     
    // The basic idea is first, find out the longest string as string a, the shorter as b.
    // For all those add two number problem, the carry is the most important thing to consider
    // We first add the short is then add the longest
    // a.charAt(lena)-'0' this line is used to make a conversion between character and number. -'0' is the key!!
    
    public String addBinary(String a, String b) {
        // Write your code here
        if (a==null || b==null){return null;}
        else{
            if (a.length()<b.length()){
                String tmp=a;
                a=b;
                b=tmp;
            }
            
            int lena=a.length()-1;
            int lenb=b.length()-1;
            int carries=0;
            String res="";
            
            
            while (lenb>=0){
                int bit=(int)(a.charAt(lena)-'0')+(int)(b.charAt(lenb)-'0')+carries;
                res=String.valueOf(bit%2)+res;
                carries=bit/2;
                lena=lena-1;
                lenb=lenb-1;
            }
            
            while (lena>=0){
                int bit=(int)(a.charAt(lena)-'0')+carries;
                res=String.valueOf(bit%2)+res;
                carries=bit/2;
                lena=lena-1;
            }
            
            if (carries==1){
                res="1"+res;
            }
            
            return res;
        }
    }
}
