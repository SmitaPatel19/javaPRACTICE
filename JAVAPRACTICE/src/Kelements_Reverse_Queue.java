import java.util.*;
public class Kelements_Reverse_Queue {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        
        Queue <Integer> qu=new LinkedList<>();
        Stack <Integer> st=new Stack<>();
        Queue<Integer> help=new LinkedList<>();

        qu.add(0);
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);

        System.out.println(qu);

        System.out.print("K = ");
        int k=scn.nextInt();

        for(int i=0;i<k;i++){
            st.push(qu.poll());
        }
        
        while(qu.isEmpty()!=true){
            help.add(qu.poll());
        }

        while(st.isEmpty()!=true){
            qu.add(st.pop());
        }
        while(help.isEmpty()!=true){
            qu.add(help.poll());
        }

        System.out.println(qu);
    }
}
