import java.util.*;
public class queue_basics {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> help=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        int s = q.size();

        for(int i=0;i<s;i++){
            System.out.print(q.peek()+" ");
            help.add(q.poll());
        }
        System.out.println();

        // int l=help.size();
        // for(int i=0;i<l;i++){
        //     System.out.print(help.poll()+" ");
        // }

        while(help.size()>0){
            q.add(help.poll());
        }
        System.out.println(q);
    }
}
