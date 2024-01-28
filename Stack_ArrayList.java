import java.util.*;
public class Stack_ArrayList {

    public static class Stack{
        
        int size=0;
        arrayli arr=new arrayli();
        //ArrayList<Integer> arr = new ArrayList<>();

        void push(int val){
            arr.add(val);
            size++;
        }   

        boolean IsEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }

        int peek(){
            if(IsEmpty()==true){
                return 0;
            }
            int x=arr.get(size-1);
            return x;
        }

        int pop(){
            if(IsEmpty()==true){
                return 0;
            }
            int top=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            size--;
            return top;
        }

        // void printStack(){
        //     while(IsEmpty() != true){
        //         System.out.print(peek()+" ");
        //         pop();
        //     }
        //     System.out.println();
        // }

        void printStack(){
            //System.out.println(arr);
            arr.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Stack st=new Stack();

        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.print("Stack : ");
        st.printStack();

        System.out.println("Size of Stack : "+st.size);

        System.out.println("top element : " + st.peek());

        st.pop();
        System.out.print("After deleting : ");
        st.printStack();
        System.out.println("Size of Stack : "+st.size);
        
        System.out.println("Stack is Empty : "+ st.IsEmpty());

    }
}
