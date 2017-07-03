import java.util.*;

public class Solution {
    private static HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
    
    public static int fibonacci(int n) {
        // Complete the function.
        
        if (n==0 || n==1){return n;}
        else{
            if (!map.containsKey(n)){
                int fib=fibonacci(n-1)+fibonacci(n-2);
                map.put(n,fib);
            }
            
            return map.get(n);
        }
      
      
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
