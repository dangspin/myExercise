public class Solution {
    /**
      * @param start, a string
      * @param end, a string
      * @param dict, a set of string
      * @return an integer
      */
    public int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
        if (start.length()!=end.length() || start.length()==0 || end.length()==0){
            return 0;
        }
        
        int ans=1;
        
        if (start.equals(end)){return ans;}
        
        Queue<String> qu=new LinkedList<String>();
        HashSet<String> visited=new HashSet<String>();
        qu.offer(start);
        visited.add(start);
        
        while (!qu.isEmpty()){
            
            int size=qu.size();
            
            for (int i=0;i<size;i++){
                String tmp=qu.remove();
                ArrayList<String> neighbors=getNeighbors(tmp,dict);
            
            for (String n:neighbors){
                if (visited.contains(n)){continue;}
                if (n.equals(end)){return ans+1;}
                else{
                    visited.add(n);
                    qu.offer(n);
                }
            }
                
            }
            
            ans++;
            
        }
        
        return ans;
    }
    
    public String replace(String s, char t, int index){
        char[] tmp=s.toCharArray();
        tmp[index]=t;
        return String.valueOf(tmp);
    }
    
    public ArrayList<String> getNeighbors(String s,Set<String> dict){
        ArrayList<String> neighbors=new ArrayList<String>();
        
        for (char c='a';c<='z';c++){
            for (int i=0;i<s.length();i++){
                if (c==s.charAt(i)){continue;}
                String neighbor=replace(s,c,i);
                
                if (dict.contains(neighbor)){
                    neighbors.add(neighbor);
                }
            }
        }
        
        return neighbors;
    }
}
