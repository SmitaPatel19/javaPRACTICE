import java.util.*;

public class CircularLinkedList {
    
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class CircularLL{

        Node head;
        Node tail;
        int size=0;

        void InsertAtHead(int data){

            Node temp=new Node(data);

            if(head==null){
                tail=temp;
                tail.next=temp;    
            }
            else{
            tail.next=temp;
            temp.next=head;
            }
            head=temp;
            size++;
        }

        void InsertAtTail(int data){

            Node temp=new Node(data);

            if(tail==null){
                head=temp;
                head.next=temp;
            }
            else{
                tail.next=temp;
                temp.next=head;
            }
            tail=temp;
            size++;
        }

        void InsertAtAny(int idx,int data){
            Node t=new Node(data);

            if(idx==0){
                InsertAtHead(data);
            }
            else if(idx==size){
                InsertAtTail(data);
            }
            else{
                Node temp=head;
                int i=1;
                while(i <= idx-1){
                    temp=temp.next;
                    i++;
                }
                t.next=temp.next;
                temp.next=t;
            }
            size++;
        }

        void deleteHead(){
            tail.next=head.next;
            head=head.next;
            size--;
        }

        void deletetail(){
            Node temp=head;
            while(temp.next!= tail){
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
            size--;
        }

        void deleteAny(int idx){
            if(idx==0){
                deleteHead();
            }

            else if(idx==size-1){
                deletetail();
            }

            else{
                Node temp=head;
                int i=1;
                while(i<=idx){
                    temp=temp.next;
                    i++;
                }
                temp.next=temp.next.next;
                size--;
            }
        }
        
        void Search(int num){

            Node temp=head;
            int count=0;
            do{
                if(temp.data==num){
                    count++;
                }
                temp = temp.next;
            }while(temp != tail.next);

            if(count==0){
                System.out.println("Not present");
            }
            else{
                System.out.println("Present");
            }
        }

        void display(){

            Node temp=head.next;
            System.out.print(head.data+" ");
            while(temp!=head){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        CircularLL list=new CircularLL();

        list.InsertAtHead(1);
        list.InsertAtHead(0);
        list.InsertAtHead(-1);

        list.InsertAtTail(2);
        list.InsertAtTail(3);
        list.InsertAtTail(5);
        list.InsertAtAny(6, 4);
        
        System.out.print("List : ");
        list.display();
        System.out.println("Size : "+list.size);
        System.out.println();

        System.out.println("After deleting at any index : ");
        list.deleteAny(5);
        list.display();
        System.out.println("Size : "+list.size);
        System.out.println("Head : "+list.head.data);
        System.out.println("Tail : "+list.tail.data);
        System.out.println();

        System.out.println("Searching : ");
        list.Search(0);
        list.Search(1);
        list.Search(2);
        list.Search(3);
        list.Search(4);
        list.Search(5);
        list.Search(6);
        System.out.println();

        System.out.println("After deleting head : ");
        list.deleteHead();
        list.display();
        System.out.println("Size : "+list.size);
        System.out.println("Head : "+list.head.data);
        System.out.println("Tail : "+list.tail.data);
        System.out.println();

        System.out.println("After deleting tail : ");
        list.deletetail();
        list.display();
        System.out.println("Size : "+list.size);
        System.out.println("Head : "+list.head.data);
        System.out.println("Tail : "+list.tail.data);
        System.out.println();
    }
}
