class Solution {
    // Sorted method, not allowed, but worth trying it!
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
        
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i-1]) {
//                 return nums[i];
//             }
//         }
        
//         return -1;
//     }
    
    // Using Hash map, not allowed
//     public int findDuplicate(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
//         for (int i = 0; i < nums.length; i++) {
//             if (!map.containsKey(nums[i])) {
//                 map.put(nums[i], 1);
//             } else {
//                 map.put(nums[i], map.get(nums[i]) + 1);
//             }
//         }
        
//         for (int i: map.keySet()) {
//             if (map.get(i) > 1) {
//                 return i;
//             }
//         }
//         return -1;
//     }
    
    
    // The most powerful method
    public int findDuplicate(int[] nums) {
        // This method is the same as detect LinkedList cycle
        
        int slow = nums[0];
        int fast = nums[0];
        
        boolean eql = false;
        
        while (!eql) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            
            if (slow == fast) {
                eql = true;
            }
        }
        
        // Find the entrance to the cycle.
        int pt1 = nums[0];
        int pt2 = slow;
        while (pt1 != pt2) {
            pt1 = nums[pt1];
            pt2 = nums[pt2];
        }

        return pt2;
        
    }
    
}
