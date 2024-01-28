import java.util.*;

public class Stack_LinkedList {

    public static class Stack{
        int size=0;
        LinkedList_basic.linkedlist list=new LinkedList_basic.linkedlist();

        void push(int val){
            list.InsertAtEnd(val);
            size++;
        }

        int peek(){
            if(IsEmpty()==true){
                System.out.println("No element.");
                return 0;
            }
            int x=list.getAt(size-1);
            return x;
        }

        int pop(){
            if(IsEmpty()==true){
                return 0;
            }
            int top=list.getAt(size-1);
            list.DeleteAt(size-1);
            size--;
            return top;
        }

        boolean IsEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }

        void display(){
            if (size==0){
                System.out.println("No Element");
            }
            list.printList();
        }
    }
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(2);
        st.push(3);

        System.out.print("Stack : ");
        st.display();
        System.out.println("Size : "+ st.size);

        System.out.println("Top Element : "+ st.peek());

        st.pop();
        System.out.print("Stack : ");
        st.display();
        System.out.println("Size : "+ st.size);
        System.out.println("Top Element : "+ st.peek());

        System.out.println("Stack is Empty : "+ st.IsEmpty());

        st.pop();
        System.out.print("Stack : ");
        st.display();
        System.out.println("Size : "+ st.size);
        System.out.println("Top Element : "+ st.peek());
        System.out.println("Stack is Empty : "+ st.IsEmpty());

    }    
}
