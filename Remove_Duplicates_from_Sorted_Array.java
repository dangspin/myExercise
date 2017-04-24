public int removeDuplicates(int[] nums) {
        if (nums.length==0){return 0;}
        if (nums.length==1){return 1;}
        
        int pt2=0;
        
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=nums[pt2]){
                pt2=pt2+1;
                nums[pt2]=nums[i];
            }
        }
        
        
        return pt2+1;
    }
    
// This is a very typical two pointers problem
