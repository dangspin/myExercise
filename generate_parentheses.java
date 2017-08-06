public class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res=new ArrayList<String>();
        
        build(res,"",n,n);
        return res;
    }
    
    public void build(ArrayList<String> res, String st, int left, int right){
        if (left==0 && right==0){
            res.add(st);
            return;
        }
        
        if (left>0){
            build(res,st+"(",left-1,right);
        }
        
        if (right>0 && left<right){
            build(res,st+")", left,right-1);
        }
    }
}
