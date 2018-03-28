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
    
    
    // BFS solution:
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        if (graph.length == 0) {return new ArrayList<List<Integer>>();}
        
        List<List<Integer>> res = new ArrayList<> ();
        
        ArrayList<List<Integer>> qu = new ArrayList<>();
        qu.add(Arrays.asList(0));
        
        while (!qu.isEmpty()) {
            List<Integer> tmp = qu.remove(0);
            
            if (tmp.get(tmp.size()-1) == graph.length-1) {
                res.add(tmp);
                continue;
            }
            
            for (int i = 0; i < graph[tmp.get(tmp.size()-1)].length; i++) {
                List<Integer> next = new ArrayList<Integer> (tmp);
                next.add(graph[tmp.get(tmp.size()-1)][i]);
                qu.add(next);
            }
        }
        
        
        return res;
    }
}

