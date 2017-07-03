import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int[] word_count=new int[26];
        
        for (char ca:first.toCharArray()){
            word_count[ca-'a']=word_count[ca-'a']+1;
        }
        
        for (char cb:second.toCharArray()){
            word_count[cb-'a']=word_count[cb-'a']-1;
        }
        
        int res=0;
        for (int i=0;i<word_count.length;i++){
            if (Math.abs(word_count[i])>=1){
                res=res+Math.abs(word_count[i]);
            }
        }
        
        return res;
      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
