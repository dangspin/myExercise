import java.util.*;


public class HelloWorld{
     
     
     public static void main(String []args){
        
        String s="abcdce";
        String t="ace";
        
        System.out.println(distinct(s,t));
     }
     
     public static int distinct(String S,String T){
         // This is the recursive solution of this problem!
         if (T.length()==0){
             return 1;
         }
         else if (S.length()==0 && T.length()!=0){
             return 0;
         }
         
         else{
             int tend=T.length()-1;
             int send=S.length()-1;
             
             if (T.charAt(tend)==S.charAt(send)){
                 return distinct(S.substring(0,send),T.substring(0,tend))+distinct(S.substring(0,send),T);
             }else{
                 return distinct(S.substring(0,send),T);
             }
         }
     }
}
