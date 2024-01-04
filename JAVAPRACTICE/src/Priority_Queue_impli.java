import java.util.*;
public class Priority_Queue_impli {

    public static class Student implements Comparable <Student>{

        String name;
        int rank;
        Student(String name,int rank){

            this.name=name;
            this.rank=rank;

        }

        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }

    }
    public static void main(String[] args) {
        
        // PriorityQueue<Integer> pq=new PriorityQueue<>();
        // pq.add(5);
        // pq.add(3);
        // pq.add(9);
        // pq.add(1);
        // pq.add(7);

        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("Smita", 1));
        pq.add(new Student("Sneha", 30));
        pq.add(new Student("Pratibha", 9));
        pq.add(new Student("Arpita", 50));


        while(pq.isEmpty()!=true){
            // System.out.print(pq.poll()+" ");
            System.out.println(pq.peek().name+" "+pq.peek().rank);//O(1)
            pq.poll();//pq.remove(); O(log n )
        }
    }    
}
