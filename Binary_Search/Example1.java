package Binary_Search;

// Problem Statement: Given an array of N distinct integers, find floor value of input ‘key’. 
// Say, A = {-1, 2, 3, 5, 6, 8, 9, 10} and key = 7, we should return 6 as outcome.

// Here We will use the optimal version of binary search. Keep in mind the optimal solution contains
// the ending condition l+1=r; This problem is looking for the lower bound of the key value.


public class Example1{
	
	public static int binarySearch(int[] a, int l, int r, int target){
		int mid;
		
		// check the corner case;
		if (target<a[0]){
			return -1;
		}
		
		// !!! In this case the upper limit must equals len(a), because we return lower limit.
		// In this example, if the target=11, we must return 10.
		
		while (r-l>1){
			mid= l+(r-l)/2;
			
			if (a[mid]<=target){
				l=mid;
			}else{
				r=mid;
			}
		}
		
		return a[l];
	}
	
	
	
	public static void main(String[] args){
		int[] array={-1,2,3,5,6,8,9,10};
		int target=11;
		
		System.out.println(binarySearch(array,0,array.length,target));
	}
}
