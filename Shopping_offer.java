public class Solution {

    // This problem is very interesting and it is not really hard. But when programming, must be careful, because it is 
    // very easy to make mistake.
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return help(price,special,needs,0);
    }
    
    public int help(List<Integer> price, List<List<Integer>> special, List<Integer> needs,int ith){
        if (ith==special.size()){
            int res=0;
            for (int i=0;i<needs.size();i++){
                res=res+needs.get(i)*price.get(i);
            }
            return res;
        }
        ArrayList<Integer> left=new ArrayList<Integer>(needs);
        
        int j=0;
        for (j=0;j<special.get(ith).size()-1;j++){
            int diff=needs.get(j)-special.get(ith).get(j);
            if (diff<0){
                break;
            }
            left.set(j,diff);
        }
        
        if (j == special.get(ith).size() - 1)
            return Math.min(special.get(ith).get(j) + help(price, special, left, ith), help(price, special, needs, ith + 1));
        else
            return help(price, special, needs, ith + 1);
    }
}
