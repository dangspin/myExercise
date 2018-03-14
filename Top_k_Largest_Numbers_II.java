public class Solution {
    
    private int[] heap;
    private int capacity;
    /*
    * @param k: An integer
    */public Solution(int k) {
        // do intialization if necessary
        heap = new int[k];
        capacity = 0;
    }

    /*
     * @param num: Number to be added
     * @return: nothing
     */
    public void add(int num) {
        // write your code here
        if (capacity < heap.length) {
            heap[capacity] = num;
            capacity++;
            Siftup(heap, capacity, capacity-1);
        } else {
            if (num <= heap[0]) {
                return;
            } else {
                heap[0] = num;
                Siftdown(heap, heap.length, 0 );
            } 
        }
        
    }

    /*
     * @return: Top k element
     */
    public List<Integer> topk() {
        // write your code here
        // Arrays.sort(heap);
        
        List<Integer> res = new ArrayList<Integer>();
        
        for (int i = 0; i < capacity; i++) {
            res.add(heap[i]);
        }
        
        Collections.sort(res, Collections.reverseOrder());
        
        return res;
    }
    
    public void Siftdown(int arr[], int n, int i)
    {
        int smallest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] < arr[smallest])
            smallest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] < arr[smallest])
            smallest = r;
 
        // If largest is not root
        if (smallest != i)
        {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;
 
            // Recursively heapify the affected sub-tree
            Siftdown(arr, n, smallest);
        }
    }
    
    public void Siftup(int arr[], int n, int i) {
        while (i > 0 && arr[i] <= arr[Parent(i)]) {
            int swap = arr[i];
            arr[i] = arr[Parent(i)];
            arr[Parent(i)] = swap;
            i = Parent(i);
        }
    }
    
    public int Parent(int i) {
        return (i-1)/2;
    }
        
}
