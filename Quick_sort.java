// Here I implement two-partition quick sort, with and without recursion

package Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * This java file realize both recursive and iterative version of quick sort
 * 
 * @author Charlie Dang
 */

class IndexPair {
	private final int start;
	private final int end;
	
	IndexPair(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	/**
	 * Get the start point
	 * @return start point
	 */
	public int getStart() {
		return this.start;
	} 
	
    /**
     * Get the end point
     * @return end point 
     */
	public int getEnd() {
		return this.end;
	}
}

public class Quick_Sort {
	
	/**
	 * partition an array
	 * 
	 * @param array: an integer array
	 * @param start: an integer, starting point
	 * @param end: an integer, ending point
	 */
	private static int partition(int[] array, int start, int end) {
		
		// pivot value
		int pivot = array[end];
		
		// This pointer points to the position, where all the elements are less than pivot
		int pindex = start;
		
		for (int i = start; i < end; i++) {
			if (array[i] <= pivot) {
				swap(array, i, pindex);
				pindex++;
			}
		}
		
		swap(array, pindex, end);
		return pindex;
	}
	
	/**
	 * swap two elements in the array
	 * 
	 * @param array: an integer array
	 * @param a: an integer, starting point
	 * @param b: an integer, ending point
	 */
	private static void swap(int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
		
	}
	
	/**
	 * Recursive implement of quick sort.
	 * 
	 * @param array: an integer array
	 * @param start: an integer, starting point
	 * @param end: an integer, ending point
	 */
	public static void recursiveSort(int[] array, int start, int end) {
		if (start <= end) {
			int pindex = partition(array, start, end);
			recursiveSort(array, start, pindex-1);
			recursiveSort(array, pindex+1, end);
		}
	}
	
	/**
	 * Iterative version of quick sort. Same principle, but requires a stack
	 * 
	 * @param array: an integer array
	 * @param start: an integer, starting point
	 * @param end: an integer, ending point
	 */
	public static void iterativeSort(int[] array, int start, int end) {
		Stack<IndexPair> stack = new Stack<IndexPair>();
		
		IndexPair pair = new IndexPair(start, end);
		stack.push(pair);
		
		while (!stack.isEmpty()) {
			IndexPair current = stack.pop();
			start = current.getStart();
			end = current.getEnd();
			
			int par = partition(array, start, end);
			
			if (par-1 >= start) {
				stack.push(new IndexPair(start, par-1));
			}
			
			if (par+1 <= end) {
				stack.push(new IndexPair(par+1, end));
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] test = {4, 3, 5, 2, 1, 3, 2, 3};
		iterativeSort(test, 0, test.length-1);
		System.out.println(Arrays.toString(test));
	}
}
