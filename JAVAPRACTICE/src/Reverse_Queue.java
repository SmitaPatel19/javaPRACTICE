import java.util.*;
public class Reverse_Queue {
    public static void main(String[] args) {
        
        Queue<Integer> qu=new LinkedList<>();
        Stack<Integer> st=new Stack<>();

        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        System.out.println(qu);

        while(qu.isEmpty()!=true){
            st.push(qu.poll());
        }

        while(st.isEmpty()!=true){
            qu.add(st.pop());
        }
        System.out.println(qu);
    }
}
