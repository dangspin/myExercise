package others;

import java.util.*;

public class k_sum2{
	
	public static List<List<Integer>> kSumII(int[] A, int k, int target) {
        // write your code here
		ArrayList<List<Integer>> res= new ArrayList<List<Integer>>();
		
		if (A.length==0 || k<=0){return res;}
		
		dfs(A,k,target,res,new ArrayList<Integer> (), 0);
		
		return res;
    }
	
	public static void dfs(int[] A, int k, int target, ArrayList<List<Integer>> res, ArrayList<Integer> tmp, int st){
		if (tmp.size()==k){
			if (target==0){
				res.add(new ArrayList<Integer>(tmp));
				return;
			}else{
				return;
			}
		}
		
		for (int i=st;i<A.length;i++){
				tmp.add(A[i]);
				dfs(A,k,target-A[i],res,tmp,i+1);
				tmp.remove(tmp.size()-1);
		}
	}
	
	public static void main(String[] args){
		int[] A= {4,3,1,2};
		int target=5;
		int k=2;
		
		System.out.println(kSumII(A,k,target));
		
	}
}
