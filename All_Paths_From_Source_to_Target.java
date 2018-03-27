class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        if (graph.length == 0) {return new ArrayList<List<Integer>>();}
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<Integer> ();
        
        DFS(graph, res, tmp, 0);
        
        return res;
    }
    
    public void DFS(int[][] graph, List<List<Integer>> res, List<Integer> tmp, int node) {
        if (node == graph.length - 1) {
            tmp.add(node);
            res.add(new ArrayList<> (tmp));
            tmp.remove(tmp.size()-1);
            return ;
        }
        
        for (int nnode: graph[node]) {
            tmp.add(node);
            DFS(graph, res, tmp,nnode);
            tmp.remove(tmp.size()-1);
        }
    }
}

