class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0) {return false;}
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
        
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                if (map.get(nums[i]) != i) {
                    if (Math.abs(map.get(nums[i]) - i) <= k) {
                        return true;
                    }
                    map.put(nums[i], i);
                }
            }
        }
        
        return false;
    }
}
