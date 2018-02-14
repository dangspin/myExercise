import java.util.*;

public class Move_zeros {
	public static void move_zeros (int[] nums, int j, int p0) {
    // Recursive version solution
		if (j == nums.length) {
			return;
		}
		
		if (nums[p0] != 0 && nums[j] != 0) {
            p0++;
        } else if (nums[p0] ==0 && nums[j] !=0) {
            swap(nums, p0, j);
            p0++;
        }
		
		move_zeros(nums, j+1, p0);
	}
	
	
	public static void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
	
	public static void main (String[] args) {
		int[] input = {0,1,0,3,12};
		
		move_zeros(input, 0, 0);
		
		System.out.println(Arrays.toString(input));
	}
}
