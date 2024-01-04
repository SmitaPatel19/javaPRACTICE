import java.util.*;

class Node{

    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

class linkedList{

    Node head=null;
    Node tail=null;
    int size=0;

    void add(int data){
        Node a=new Node(data);
        if(head==null) {
            head=a;
            tail=a;
            size++;
        }
        else{
            tail.next=a;
            tail=a;
            size++;
        }
    }

    void insertAtBeginning(int data){
        Node a=new Node(data);
        if(head==null){
            head=a;
            tail=a;
        }
        else{
            a.next=head;
            head=a;
        }
        size++;
    }

    void insertAt(int idx,int data){
        Node a=new Node(data);

        if(idx==0){
            insertAtBeginning(data);
            return;
        }else if(idx>=size){
            add(data);
            return;
        }
        else{
            Node temp=head;
            int i=1;
            while(i<idx){
                temp=temp.next;
                i++;
            }
            a.next=temp.next;
            temp.next=a;
            size++;
        }
    }

    int getAt(int idx){
        Node temp=head;
        int i=1;
        while(i<=idx){
            temp=temp.next;
            i++;
        }
        return temp.data;
    }

    void deleteAt(int idx){
        int i=1;
        if(idx==0){
            head=head.next;
        }else if(idx==size-1){
            Node temp=head;
            while(i<idx){
                temp=temp.next;
                i++;
            }
            temp.next=null;
            tail=temp;
        }
        else{
            Node temp=head;
            while(i<idx){
                temp=temp.next;
                i++;
            }
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

    int length(){
        return size;
    }
}
public class LinkedList_basic {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        linkedList list=new linkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.insertAtBeginning(0);
        list.insertAtBeginning(-1); 
        list.insertAt(3, 7);
        list.insertAt(7, 5);
        //list.insertAt(0, -2);

        list.display();

        System.out.println("Size of list : "+list.length());
        System.out.println(list.getAt(0));
        System.out.println(list.getAt(3));
        System.out.println(list.getAt(7));

        list.deleteAt(3);
        list.display();
        list.deleteAt(0);
        list.display();
        list.deleteAt(5);
        list.display();
    }    

}
