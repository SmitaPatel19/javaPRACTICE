import java.util.*;
public class QueueArrayList {

    public static class Queue{
        arrayli arr = new arrayli();
        int size=0;
        int front=-1;

        boolean IsEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }

        void add(int n){
            arr.add(n);
            front=arr.get(0);
            size++;
        }

        int poll(){
            if(IsEmpty()==true){
                return -1;
            }
            int val=arr.get(0);
            arr.remove(0);
            front=arr.get(0);
            size--;
            return val;
            
        }

        int peek(){
            if(IsEmpty()==true){
                return -1;
            }
            return front;
        }

        void displayQueue(){

            arr.display();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Queue qu = new Queue();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);

        System.out.println("Original Queue : ");
        qu.displayQueue();
        System.out.println("Front element : " + qu.peek());
        System.out.println("Size : " + qu.size);
        System.out.println();

        System.out.println("After Deleting : ");
        qu.poll();
        System.out.print("New Queue : ");
        qu.displayQueue();
        System.out.println("Front element : " + qu.peek());
        System.out.println("Size : " + qu.size);
        System.out.println();

        System.out.println("After Deleting : ");
        System.out.println("Deleted Element : "+ qu.poll());
        System.out.print("New Queue : ");
        qu.displayQueue();
        System.out.println("Front element : " + qu.peek());
        System.out.println("Size : " + qu.size);
    }    
}
