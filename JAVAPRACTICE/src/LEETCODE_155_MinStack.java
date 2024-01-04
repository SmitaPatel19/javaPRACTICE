import java.util.ArrayList;
import java.util.Collections;

public class LEETCODE_155_MinStack {
    public static class MinStack {
        ArrayList<Integer> stck = new ArrayList<>();
        int size;

    public MinStack() {
        this.size=0;
    }
    
    public void push(int val) {

        stck.add(val);
        size++;   
    }
    
    public void pop() {
        //int top=stck.get(size-1);
        stck.remove(size-1);
        size--;
    }
    
    public int top() {
        int top=stck.get(size-1);
        return top;    
    }
    
    public int getMin() {
        ArrayList <Integer> clonstack = (ArrayList<Integer>) stck.clone();
        Collections.sort(clonstack);
        return clonstack.get(0);  
    }

}

    public static void main(String[] args) {
        MinStack obj =new MinStack();

        obj.push(-1);
        obj.push(0);
        obj.push(-2);

        System.out.println(obj.top());

        System.out.println(obj.getMin());

        obj.pop();

        System.out.println(obj.top());

        System.out.println(obj.getMin());
    }
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 **/

}
