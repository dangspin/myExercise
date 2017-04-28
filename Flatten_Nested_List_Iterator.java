/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer,
 *     // rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds,
 *     // if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds,
 *     // if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
import java.util.Iterator;

public class NestedIterator implements Iterator<Integer> {
    
    private Stack<NestedInteger> stack1;
    private Stack<NestedInteger> stack2;

    public NestedIterator(List<NestedInteger> nestedList) {
        // Initialize your data structure here.
        stack1=new Stack<NestedInteger>();
        stack2=new Stack<NestedInteger>();
        
        for (NestedInteger niter:nestedList){
            stack2.push(niter);
        }
        
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        
    }

    // @return {int} the next element in the iteration
    @Override
    public Integer next() {
        // Write your code here
        if (!hasNext()){
            return null;
        }
        return stack1.pop().getInteger();
    }

    // @return {boolean} true if the iteration has more element or false
    @Override
    public boolean hasNext() {
        // Write your code here
        while (!stack1.empty() && !stack1.peek().isInteger()){
            List<NestedInteger> nlist=stack1.pop().getList();
            
            for (NestedInteger niter:nlist){
                stack2.push(niter);
            }
            
            while (!stack2.empty()){
                stack1.push(stack2.pop());
            }
            
        }
        
        return !stack1.empty();
        
    }

    @Override
    public void remove() {}
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v.add(i.next());
 */
