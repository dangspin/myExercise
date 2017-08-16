public class Solution {
    /**
     * @param n an integer
     * @param str a string with number from 1-n
     *            in random order and miss one number
     * @return an integer
     */
    public int ans=0;
	
	public int findMissing2(int n, String str) {
        // Write your code here
		if (n<=0 || str.length()==0){return -1;}
		
		boolean[] isVisited=new boolean[n+1];
		
		dfs(n,str,isVisited,0);
		
		return ans;
    }
	
	public boolean dfs(int n, String str, boolean[] isVisited, int st){
		if (st>=str.length()){
			for (int i=1;i<=n;i++){
				if (isVisited[i]==false){
					ans=i;
				}
			}
			return true;
		}
		
		for (int i=0;i<=1;i++){
		    if (st+i+1>str.length()){break;}
		    
			int target=Integer.valueOf(str.substring(st, st+i+1));
			if (target==0){return false;}
			
			if (target<=n && !isVisited[target]){
				isVisited[target]=true;
				if (dfs(n,str,isVisited,st+1+i)){
					return true;
				}
				isVisited[target]=false;
			}
		}
		
		
		
		return false;
	}
}
