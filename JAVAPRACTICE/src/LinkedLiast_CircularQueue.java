import java.net.DatagramSocketImplFactory;

public class LinkedLiast_CircularQueue {

    public static class Node{
        Node next;
        int data;
        Node(int val){
            this.data=val;
        }
    }

    public static class LLCircularQueue{

        Node head=null;
        Node tail=null;
        int size=0;

        void add(int val){
            Node temp=new Node(val);
            if(size==0){
                head=temp;
                tail=temp;
                tail.next=head;
                size++;
            }
            else{
                tail.next=temp;
                tail=temp;
                tail.next=head;
                size++;
            }
        }

        boolean IsEmpty(){
            if(size==0){
                return true;
            }
            else{
                return false;
            }
        }

        int poll() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!!!!");
            }
            else{
                int top=head.data;
                head=head.next;
                tail.next=head;
                size--;
                return top;
            }
        }

        int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty!!!");
            }
            else{
                return head.data;
            }
        }

        void display() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!!!");
            }
            else{
                Node temp=head;
                do{
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }while(temp!=head);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        LLCircularQueue lcq=new  LLCircularQueue();

        System.out.println(lcq.IsEmpty());

        lcq.add(1);
        System.out.println(lcq.IsEmpty());
        lcq.add(2);
        lcq.add(3);
        lcq.add(4);
        lcq.add(5);

        lcq.display();

        System.out.println(lcq.peek());
        System.out.println(lcq.size);

        System.out.println(lcq.poll());
        System.out.println(lcq.poll());
        lcq.add(6);
        lcq.add(7);
        lcq.display();
        System.out.println(lcq.peek());
        System.out.println(lcq.size);
    }
}
