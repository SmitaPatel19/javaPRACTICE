import java.util.*;
public class Array_Queue {
    public static class QueueArray{
        int n=5;
        int arr[]=new int[n];
        int size=0;
        int f=-1;
        int r=-1;

        // QueueArray(int s){
        //     this.n=s;
        // }

        void add(int val){
            if(r>=arr.length-1){
                System.out.println("Array is full.");
            }
            if(f==-1){
                f=0;
                r=0;
                arr[0]=val;
                size++;
            }
            else {
                arr[r+1]=val;
                size++;
                r++;
            }
        }

        int poll(){
            f++;
            size--;
            return arr[f-1];
        }

        int peek(){
            return arr[f];
        }

        void display(){
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        boolean IsEmpty(){
            if(f==-1){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        QueueArray qu=new QueueArray();
        System.out.println(qu.IsEmpty());
        qu.add(1);
        System.out.println(qu.IsEmpty());
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
      
        qu.display();
        System.out.println(qu.peek());

        qu.poll();
        System.out.println(qu.IsEmpty());
        qu.display();
        System.out.println(qu.peek());
        System.out.println(qu.size);
    }    
}
