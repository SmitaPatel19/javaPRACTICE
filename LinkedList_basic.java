//import java.util.*;
public class LinkedList_basic {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;

        void InsertAtStart(int data) { 

            Node temp = new Node(data);

            if (head == null) {
                tail = temp;
                // head=tail=temp;
            } else {
                temp.next = head;
            }
            head = temp;
        }

        void InsertAtEnd(int data){ 

            Node temp=new Node(data);
            if(head==null){
                head=temp;
                //tail=temp;
            }
            else{
                tail.next=temp;
                //tail=temp;
            }
            tail=temp;

        }

        void InsertAtMid(int idx,int data){
            Node temp=new Node(data);

            if(head==null){
                head=tail=temp;
            }
            else if(idx==0){
                InsertAtStart(data);
            }
            else if(idx==size()){
                InsertAtEnd(data);
            }
            else if(idx<0 || idx>size()){
                System.out.println("Invalid Index");
            }
            else{
                Node t=head;
                int i=1;
                while(i<=idx-1){
                    t=t.next;
                    i++;
                }
                temp.next=t.next;
                t.next=temp;
            }
        }


        int getAt(int idx) {

            int i = 1;
            Node temp = head;
            while (i <= idx) {
                temp = temp.next;
                i++;
            }
            return temp.data;
        }

        int size() {

            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;

        }

        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void DeleteAt(int idx){
            if(idx==0){
                head=head.next;
                return;
            }

            Node temp=head;
            int i=1;
            //for(int i=1;i<=idx-1;i++){
            while(i!=idx){
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;

            if(idx==size()){
                tail=temp;
            }
        }
    }
        public static void main(String[] args) {
        
            linkedlist obj=new linkedlist();

            obj.InsertAtEnd(4);
            obj.InsertAtEnd(5);
            obj.InsertAtStart(3);
            obj.InsertAtEnd(6);
            obj.InsertAtEnd(7);
            obj.InsertAtEnd(8);
            obj.InsertAtMid(0, 0);

            System.out.print("List : ");
            obj.printList();

            System.out.println("Head = "+obj.head.data);
            System.out.println("Tail = "+obj.tail.data);
            System.out.println("data is : "+obj.getAt(1));
            System.out.println("size : "+obj.size());

            obj.DeleteAt(5);
            System.out.print("List After Deleting : ");
            obj.printList();
        }    
}
