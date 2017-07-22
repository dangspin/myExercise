package Binary_Search;

// Problem Statement: Given a sorted array with possible duplicate elements. 
// Find number of occurrences of input ‘key’ in log N time.

// We are looking for the lower and upper bound of a sorted array. 
// We will use the optimal Binary Search again

public class Example2{
	
	public static int getLeft(int[] a, int l, int r, int target){
		int mid;
		
		while (r-l>1){
			mid=l+(r-l)/2;
			
			if (a[mid]>=target){
				r=mid;
			}else{
				l=mid;
			}
		}
		return l;
	}
	
	public static int getRight(int[] a, int l, int r, int target){
		int mid;
		
		while (r-l>1){
			mid=l+(r-l)/2;
			
			if (a[mid]<=target){
				l=mid;
			}else{
				r=mid;
			}
		}
		return l;
	}
	
	
	
	public static void main(String[] args){
		int[] array={1,1,2,2,2,2,3};
		int target=2;
		
		int left=getLeft(array,-1,array.length-1,target);
		int right=getRight(array,0,array.length,target);
		
		System.out.println(right-left);
	}
}
