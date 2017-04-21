class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
        // This implementation is counting sort. I use a extra space for counting;
        int [] count={0,0,0};
        
        for (int i=0;i<nums.length;i++){
            count[nums[i]]=count[nums[i]]+1;
        }
        
        int j=0;
        while (j<nums.length){
            if (j<count[0]){
                nums[j]=0;
            }
            
            else if (j>(count[0]+count[1]-1)){
                nums[j]=2;
            }else{
                nums[j]=1;
            }
            
            j++;
        }
    }
    
    public void sortColors(int[] nums) {
        // write your code here
        // This is one loop version with three pointers. The method is very tricky,since for the 
        // third if condition, we do not need to move i pointer, it will wait for the next judgement;
        int lp=0;
        int rp=nums.length-1;
        
        int i=0;
        while (i<=rp){
            if (nums[i]==0){
                swap(nums,i,lp);
                lp++;
                i++;
            }else if (nums[i]==1){
                i++;
            }else{
                swap(nums,i,rp);
                rp--;
            }
        }
    }
    
    public void swap(int[] nums,int i,int point){
        int tmp=nums[i];
        nums[i]=nums[point];
        nums[point]=tmp;
    }

}
