/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) {
            int[] res = new int[0];
            return res;
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
        ArrayList<Integer> res = new ArrayList<Integer> ();
        
        TreeSumhelp(root, map);
        
        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                res.add(entry.getKey());     // Print the key with max value
            }
        }
        
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        
        return ans;
        
    }
    
    public int TreeSumhelp(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null) {
            return 0;
        }
        
        int leftsub = TreeSumhelp(root.left, map);
        int rightsub = TreeSumhelp(root.right, map);
        
        int res = root.val + leftsub + rightsub;
        
        if (!map.containsKey(res)) {
                map.put(res, 1);
        } else {
                map.put(res, map.get(res) + 1);
        }
        
        return res;
        
    }
}
