public class QueueLinkedList {

    public static class Queue{

        LinkedList_basic.linkedlist list = new LinkedList_basic.linkedlist();
        int size=0;
        int front=-1;

        boolean IsEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }

        void add(int data){

            list.InsertAtEnd(data);
            front = list.getAt(0);
            size++;
        }

        int peek(){

            if(IsEmpty()==true){
                return -1;
            }

            return front;
        }

        int poll(){

            if(IsEmpty()==true){
                return -1;
            }
            int val=list.getAt(0);
            list.DeleteAt(0);
            size--;
            front=list.getAt(0);
            return val;
        }

        void displayQueue(){
            list.printList();
            
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
        System.out.println("Deleted Element : " + qu.poll());
        System.out.print("New Queue : ");
        qu.displayQueue();
        System.out.println("Front element : " + qu.peek());
        System.out.println("Size : " + qu.size);
    }
}
