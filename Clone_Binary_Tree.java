public class Solution {
    /**
     * @param root: The root of binary tree
     * @return root of new tree
     */
    
    // Recursive version
    public TreeNode cloneTree(TreeNode root) {
        // Write your code here
        
        // A preorder version of recursive solution
        if (root==null){return null;}
        else{
            TreeNode newNode= new TreeNode(root.val);
            newNode.left= cloneTree(root.left);
            newNode.right= cloneTree(root.right);
            return newNode;
        }
    }
    
    // Iterative version, two queues to traverse two trees
    public TreeNode cloneTree(TreeNode root){
        // This is the iterative version of the problem. Here, I considered the BFS with two queues.
        // One is used to track the old tree, the other is used to build the new tree.
        if (root==null){return null;}
        else{
            TreeNode newNode= new TreeNode(root.val);
            
            ArrayList<TreeNode> queue=new ArrayList<TreeNode> ();
            ArrayList<TreeNode> q2=new ArrayList<TreeNode> ();
            queue.add(root);
            q2.add(newNode);
            
            TreeNode node1;
            TreeNode node2;
            while (queue.size()!=0){
                node1=queue.remove(0);
                node2=q2.remove(0);
                
            
                if (node1.left!=null){
                    queue.add(node1.left);
                    node2.left=new TreeNode(node1.left.val);
                    q2.add(node2.left);
                }else{
                    node2.left=null;
                }
                
                if (node1.right!=null){
                    queue.add(node1.right);
                    node2.right=new TreeNode(node1.right.val);
                    q2.add(node2.right);
                }else{
                    node2.right=null;
                }
                
            }
            
            return newNode;
        }
    }
}
