public class LinkedList_Queue {

    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }

    public static class QueueLL{

        Node head=null;
        Node tail=null;
        int size=0;

        void add(int val){
            Node temp=new Node(val);
            if(size==0){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }

        int poll(){
            int top=head.data;
            head=head.next;
            size--;
            return top;
        }

        int peek(){
            return head.data;
        }

        int size(){
            return size;
        }

        void display(){
            if(size==0){
                System.out.print("Queue is empty.");
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
    }
}
