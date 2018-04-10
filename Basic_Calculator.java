class Solution {
    public int calculate(String s) {
    
    // This problem is so interesting!
    // The way we use stack in this problem is exactly the same as in assembly language,
    // where we can clear out the register (in our case, the variable res), and save the value in a stack
    // so that we can use the register res repeatly, and all the previous information are stored in the stack
    // whenver we meet the symbol ')' we pop up the stack and add them all to the current res (this process is also a recursive way)
    // this is how computer solveS the input STRING problem.
    
        if (s.length() == 0) {return 0;}
        
        int res = 0;
        int sign = 1;
        
        Stack<Integer> st = new Stack<Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int sum = s.charAt(i) - '0';
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    sum = sum * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                res += sum * sign;
            }
            else if (s.charAt(i) == '+') {
                sign = 1;
            }
            else if (s.charAt(i) == '-') {
                sign = -1;
            }
            else if (s.charAt(i) == '(') {
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
            } else if (s.charAt(i) == ')') {
                res = res*st.pop() + st.pop();
            }
        }
        
        return res;
    }
}
