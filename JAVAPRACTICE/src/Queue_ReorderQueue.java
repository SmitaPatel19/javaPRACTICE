import java.util.*;
public class Queue_ReorderQueue {
    public static void main(String[] args) {
        
        Queue<Integer> qu=new LinkedList<>();

        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.add(6);
        qu.add(7);
        qu.add(8);

        Stack<Integer> st=new Stack<>();
        int n=qu.size();
        int n1=n/2;

        for(int i=0;i<n1;i++){
            st.push(qu.peek());
            qu.poll();
        }

        while(!st.isEmpty()){
            qu.add(st.peek());
            st.pop();
        }

        for(int i=0;i<n1;i++){
            st.push(qu.poll());
        }

        while (!st.isEmpty()) {
            qu.add(st.peek());
            st.pop();
            qu.add(qu.poll());
        }

        while(!qu.isEmpty()){
            st.push(qu.poll());
        }

        while(!st.isEmpty()){
            qu.add(st.peek());
            st.pop();
        }

        System.out.println("Answer: "+qu);
    }    
}
