/**
 * Definition for Directed graph.
 * class DirectedGraphNode {
 *     int label;
 *     ArrayList<DirectedGraphNode> neighbors;
 *     DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
 * };
 */
 
// Method1: 
public class Solution {
    /**
     * @param graph: A list of Directed graph node
     * @return: Any topological order for the given graph.
     */    
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        // write your code here
        ArrayList<DirectedGraphNode> res= new ArrayList<DirectedGraphNode>();
        if (graph.size()==0){return res;}
        
        HashSet<DirectedGraphNode> visited=new HashSet<DirectedGraphNode>();
        Stack<DirectedGraphNode> stack=new Stack<DirectedGraphNode>();
        
        for (DirectedGraphNode node: graph){
            if (!visited.contains(node)){
                dfs(node,visited,stack);
            }
        }
        
        while (!stack.empty()){
            res.add(stack.pop());
        }
        
        return res;
    }
    
    public void dfs(DirectedGraphNode node, HashSet<DirectedGraphNode> visited, Stack<DirectedGraphNode> stack){
        
        visited.add(node);
        
        for (DirectedGraphNode newnode:node.neighbors){
            if (!visited.contains(newnode)){
                dfs(newnode,visited,stack);
            }
        }
        
        stack.push(node);
        
    }
}


//Method ii
