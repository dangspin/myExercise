import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    // This is very typical example of memorization to solve recursive problem
    // otherwise, a pure recursive solution might experience stackoverflow problem.
    
    private static Map<Integer, Integer> map = new HashMap<>();
    
    public static int findways(int n){
        if (n==0){
            return 1;
        }
        
        else if (n<0){return 0;}
        
        else{
            if (!map.containsKey(n)){
                int value=findways(n-1)+findways(n-2)+findways(n-3);
                map.put(n,value);
            }
            return map.get(n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(findways(n));
        }
    }
}
