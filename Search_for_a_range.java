public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        Arrays.fill(res,-1);
        
        if (nums.length==0){return res;}
        
        
        int id1=lower(nums,0,nums.length-1,target);
        int id2=upper(nums,0,nums.length-1,target);
        
        if (id1!=-1 && id2!=-1){
            res[0]=id1;
            res[1]=id2;
        }
        
        return res;
    }
    
    public int lower(int[] nums,int st, int en, int target){
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
        }else if (nums[en]==target){
            return en;
        }else{
            return -1;
        }
    }
    
    public int upper(int[] nums,int st, int en, int target){
        while (st+1<en){
            int mid=st+(en-st)/2;
            
            if (nums[mid]<=target){
                st=mid;
            }else{
                en=mid-1;
            }
        }
        
        if (nums[en]==target){
            return en;
        }else if (nums[st]==target){
            return st;
        }else{
            return -1;
        }
    }
}
