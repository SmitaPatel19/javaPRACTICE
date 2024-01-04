import java.util.*;
public class ReorderQueueby_Stack {
    
    public static void main(String[] args) {
        
        Queue<Integer> qu=new LinkedList<>();
        Stack <Integer> st=new Stack<>();

        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        qu.add(6);
        qu.add(7);
        qu.add(8);

        System.out.println(qu);
        
        int n=qu.size();
        for(int i=0;i<n/2;i++){
            st.push(qu.poll());
        }

        while(st.isEmpty()!=true){
            qu.add(st.pop());
        }

        for(int i=0;i<n/2;i++){
            st.push(qu.poll());
        }

        while(st.isEmpty()!=true){
            qu.add(st.pop());
            qu.add(qu.poll());
        }

        while(qu.isEmpty()!=true){
            st.push(qu.poll());
        }
        while(st.isEmpty()!=true){
            qu.add(st.pop());
        }
        System.out.println(qu);
    }



}
