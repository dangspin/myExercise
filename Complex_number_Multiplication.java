class Solution {
    public String complexNumberMultiply(String a, String b) {
        int Ra = Real(a);
        int Rb = Real(b);
        
        int Ima = Im(a);
        int Imb = Im(b);
        
        String res = "";
        res = res + String.valueOf(Ra*Rb-Ima*Imb)+"+"+String.valueOf(Ra*Imb+Ima*Rb)+"i";
        
        return res;
    }
    
    public int Real(String a) {
        int i = a.indexOf("+");
        
        return Integer.valueOf(a.substring(0,i));
    }
    
    public int Im(String a) {
        int i = a.indexOf("+");
        
        return Integer.valueOf(a.substring(i+1, a.length()-1));
    }
}
