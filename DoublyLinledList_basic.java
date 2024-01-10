public class DoublyLinledList_basic {

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }

    public static class DoubleLL{
        Node head;
        Node tail;
        int size=0;

        void InsertAtHead(int data){

            Node temp=new Node(data);
            if(head==null){
                tail=temp;
                
            }
            else{
            temp.next=head;
            head.prev=temp;
            }
            head=temp;
            size++;
        }

        void InsertAtLast(int data){

            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                Node t=head;
                while(t.next != null){
                    t=t.next;

                }
                t.next=temp;
                temp.prev=t;
            }
            tail=temp;
            size++;
        }

        void InsertAtAny(int idx,int data){
            Node temp=new Node(data);

            if(head==null){
                head=temp;
                tail=temp;
            }
            else if(idx==0){
                InsertAtHead(data);
            }
            else if(idx==size){
                InsertAtLast(data);
            }
            else{
                Node t=head;
                int i=1;
                while(i<=idx-1){
                    t=t.next;
                    i++;
                }
                t.next.prev=temp;
                temp.prev=t;
                temp.next=t.next;
                t.next=temp;

            }
            size++;
        }

        void Search(int data){
            Node temp=head;
            int count=0;
            while(temp!=null){
                if(temp.data==data){
                    count++;
                }
                temp=temp.next;
            }

            if(count==0){
                System.out.println("Not Present");
            }
            else{
                System.out.println("Present");
            }
        }

        void deleteHead(){
            Node temp=head;
            head=temp.next;
            temp.next.prev=null;
            size--;
        }

        void deleteTail(){
            Node temp=tail;
            tail=temp.prev;
            temp.prev.next=null;
            size--;
        }

        void deleteAtAny(int idx){
            if(idx==0){
                deleteHead();
            }
            else if(idx==(size-1)){
                deleteTail();
            }
            else{
                Node temp=head;
                int i=0;

                while(i < idx-1){
                    temp=temp.next;
                    i++;
                }
                temp.next.next.prev=temp;
                temp.next=temp.next.next;
            }
            size--;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        DoubleLL list=new DoubleLL();

        list.InsertAtHead(2);
        list.InsertAtLast(3);
        list.InsertAtHead(1);
        list.InsertAtLast(5);
        list.InsertAtLast(6);
        list.InsertAtAny(3,4);
        System.out.println("List : ");
        list.display();
        System.out.println("Size : "+ list.size);

        System.out.print("Element is present  or not : ");
        list.Search(5);

        list.deleteHead();
        System.out.println("After deleting Head : ");
        list.display();
        System.out.println("Head : "+list.head.data);
        System.out.println("Tail : "+list.tail.data);
        System.out.println("Size : "+ list.size);

        System.out.println("After Deleting tail : ");
        list.deleteTail();
        list.display();
        System.out.println("Head : "+list.head.data);
        System.out.println("Tail : "+list.tail.data);
        System.out.println("Size : "+ list.size);
        
        System.out.println("After Deleting at index : ");
        list.deleteAtAny(1);
        list.display();
        System.out.println("Head : "+list.head.data);
        System.out.println("Tail : "+list.tail.data);
        System.out.println("Size : "+ list.size);
        
    }
}
