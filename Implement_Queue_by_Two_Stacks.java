public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
       // do initialization if necessary
       stack1=new Stack<Integer>();
       stack2=new Stack<Integer>();
    }
    
    public void push(int element) {
        // write your code here
        stack1.push(element);
    }

    public int pop() {
        // write your code here
        while (!stack1.empty()){
            int ele=stack1.pop();
            stack2.push(ele);
        }
        
        int res=stack2.pop();
        
        while (!stack2.empty()){
            int ele=stack2.pop();
            stack1.push(ele);
        }
        
        return res;
    }

    public int top() {
        // write your code here
        while (!stack1.empty()){
            int ele=stack1.pop();
            stack2.push(ele);
        }
        
        int res=stack2.peek();
        
        while (!stack2.empty()){
            int ele=stack2.pop();
            stack1.push(ele);
        }
        
        return res;
    }
}
