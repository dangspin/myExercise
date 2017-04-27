public class MinStack {
    
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    
    public MinStack() {
        // do initialize if necessary
        stack1=new Stack<Integer>();
        stack2=new Stack<Integer>();
    }

    public void push(int number) {
        // write your code here
        stack1.push(number);
    }

    public int pop() {
        // write your code here
        return stack1.pop();
    }

    public int min() {
        // write your code here
        
        int mini=stack1.pop();
        stack2.push(mini);
        
        while (!stack1.empty()){
            
            int ele=stack1.pop();
            stack2.push(ele);
            
            if (ele<=mini){
                mini=ele;
            }
        }
        
        int res=mini;
        
        
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
        
        return res;
        
    }
}
