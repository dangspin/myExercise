class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<> ();
        if (num < 0) {return res;}
        
        int[] hours = {8,4,2,1};
        int[] minutes = {32, 16, 8,4,2,1};
        
        
        for (int i = 0; i <= num; i++) {
            List<Integer> hour = getTime(hours, i, 12);
            List<Integer> minute = getTime(minutes, num -i, 60);
            
            for (int h : hour) {
                for (int m : minute) {
                    String s = "";
                    if (m/10 == 0 ) {
                        s = h + ":"+"0"+m;
                    } else {
                        s = h + ":"+ m;
                    }
                    
                    res.add(s);
                }
            }
        }
        return res;
        
    }
    
    public List<Integer> getTime(int[] nums, int tot, int limit) {
        List<Integer> res = new ArrayList<> ();
        
        getTimeDFS(res, nums, tot, 0, 0, limit);
        return res;
    }
    
    public void getTimeDFS(List<Integer> res, int[] nums, int tot, int time, int index, int limit) {
        
        if (index > nums.length) {return;}
        
        if (tot == 0) {
            if (time < limit) {
                res. add(time);
                return;
            }
        }
        
        for (int i = index; i < nums.length; i++) {
            getTimeDFS(res, nums, tot - 1, time + nums[i], i + 1, limit);
        }
    }
}
