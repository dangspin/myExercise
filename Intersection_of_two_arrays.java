public class Solution {

    // This is a very interesting problem. Of course there are two other solutions: 1 Hashtable, 2. Two pointer.
    // However the binary search solution is quite easy to understand and also could be generalized to the follow up questions.
    // Be careful, we are using the lower bound of binary search. Which guanreteen that we can always find a solution.

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums2.length==0) {return new int[0];}
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        ArrayList<Integer> res=new ArrayList<Integer>();
        
        int st=0;int en=nums1.length-1;
        
        for(int i=0;i<nums2.length;i++){
            if (st<=en){
                int id=binary(nums1,st,en,nums2[i]);
            
                if (id!=-1){
                    res.add(nums2[i]);
                    st=id+1;
                }    
            }else{
                break;
            }
            
        }
        
        int[] fres=new int[res.size()];
        for (int j=0;j<res.size();j++){
            fres[j]=res.get(j);
        }
        
        return fres;
    }
    
    public int binary(int[] nums, int st, int en, int target){
        while (st+1<en){
            int mid=st+(en-st)/2;
            
            if (nums[mid]>=target){
                en=mid;
            }else{
                st=mid+1;
            }
        }
        
        if (nums[st]==target){
            return st;
        }else if(nums[en]==target){
            return en;
        }else{
            return -1;
        }
    }
}
