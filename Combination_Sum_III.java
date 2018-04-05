class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<> ();
        
        findComb(res, new ArrayList<Integer>(),1, k, n, 0);
        
        return res;
    }
    
    public void findComb(List<List<Integer>> res, ArrayList<Integer> tmp, int st, int k, int n, int sum) {
        if (sum > n) {
            return;
        }
        if (tmp.size() == k && sum == n) {
            res.add(new ArrayList<Integer>(tmp));
            return;
        }
        
        for (int i = st; i <= 9; i++) {
            tmp.add(i);
            findComb(res, tmp, i+1, k, n, sum + i);
            tmp.remove(tmp.size() - 1);
        }
    }
}
