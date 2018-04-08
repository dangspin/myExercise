class Solution {
    public int calPoints(String[] ops) {
        if (ops.length == 0) {return 0;}
        
        int res = Integer.valueOf(ops[0]);
        Stack<Integer> st = new Stack<Integer> ();
        st.push(Integer.valueOf(ops[0]));
        
        for (int i = 1; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                int tmp = Integer.valueOf(st.pop());
                res = res - tmp;
            } else if (ops[i].equals("+")) {
                int tmp2 = Integer.valueOf(st.pop());
                int tmp1 = Integer.valueOf(st.pop());
                int tmp = tmp1 + tmp2;
                st.push(tmp1);
                st.push(tmp2);
                st.push(tmp);
                res = res + tmp;
                
            } else if (ops[i].equals("D")) {
                int tmp1 = Integer.valueOf(st.pop());
                int tmp = tmp1*2;
                st.push(tmp1);
                st.push(tmp);
                res = res + tmp;
            } else {
                st.push(Integer.valueOf(ops[i]));
                res = res + Integer.valueOf(ops[i]);
            }
        }
        
        return res;
    }
}
