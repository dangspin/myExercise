public class Solution {
    /**
     * @param tokens The Reverse Polish Notation
     * @return the value
     */
    public int evalRPN(String[] tokens) {
        // Write your code here
        Stack<Integer> stack=new Stack<Integer>();
        
        String operators="+-*/";
        
        for (String token:tokens){
            if (!operators.contains(token)){
                stack.push(Integer.valueOf(token));

            }
            else{
                int a=stack.pop();
                int b=stack.pop();
                
                if (token.equals("+")){
                    stack.push(a+b);
                }
                else if (token.equals("-")){
                    stack.push(b-a);
                }
                else if (token.equals("*")){
                    stack.push(a*b);
                }
                else if (token.equals("/")){
                    stack.push(b/a);
                }
                
            }
            
        }
        
        return stack.pop();
    }
}
