import java.util.*;

class TreeNode {
	public int val;
	public TreeNode left, right;
	
	public TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}
}

public class Binary_tree_serialization {
	public static String serialize(TreeNode root) {
		if (root == null) {return "";}
		
		StringBuilder sb = new StringBuilder("{");
		
		ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			TreeNode current = queue.remove(0);
			
			if (current != null) {
				sb.append(String.valueOf(current.val)+ ",");
				queue.add(current.left);
				queue.add(current.right);
			} else {
				sb.append("#,");
			}
		}
		
		sb.deleteCharAt(sb.length()-1);
		sb.append("}");
		
		System.out.println(sb);
		
		
		return sb.toString();
	}
	
	public static TreeNode deserialize(String treeroot) {
		if (treeroot.equals("")) {return null;}
		String root = treeroot.substring(1, treeroot.length()-1);
		
		StringTokenizer st = new StringTokenizer(root, ",");
		
		return deserializeHelper(st);
	}
	
	public static TreeNode deserializeHelper(StringTokenizer root) {
		if (!root.hasMoreTokens()) {
			return null;
		}
		
		String val = root.nextToken();
		if (val.equals("#")) {
			return null;
		}
		
		TreeNode newroot = new TreeNode(Integer.valueOf(val));
		newroot.left = deserializeHelper(root);
		newroot.right = deserializeHelper(root);
		
		return newroot;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		
		String res = serialize(root);
		System.out.println(res);
		
		
	}
}
