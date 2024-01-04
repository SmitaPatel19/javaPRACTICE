import java.util.*;
public class Heap_ArrayList {

    public static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        
        void add(int val){

            arr.add(val);

            int x=arr.size()-1;
            int par=(x-1)/2;

            //heapify(0);

            while(arr.get(x)<arr.get(par)){

                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }

        void display(){
            System.out.println(arr);
            // while(isEmpty()!=true){
            //     System.out.print(peek()+" ");
            //     Delete();
            // }
        }

        int peek(){

            if(arr.size()==0){
                System.out.println("Heap is Empty!!!");
                return -1;
            }
            else{
            return arr.get(0);
            }
        }

        int Delete(){

            if(arr.size()==0){
                System.out.println("Heap is Empty!!!");
                return -1;
            }
            else if(arr.size()==1){
                int data=arr.get(0);
                arr.remove(0);
                return data;
            }
            else{

                int data=arr.get(0);

                //swap first and last val
                int temp=arr.get(0);
                arr.set(0,arr.get(arr.size()-1));
                arr.set(arr.size()-1,temp);
            
                //delete
                arr.remove(arr.size()-1);

                //rearrange
                heapify(0);
                return data;
            }
        }

        void heapify(int i){
            
            int minidx=i;
            int left=2*i+1;
            int right=2*i+2;

            //finding minimum
            if(left<arr.size() && (arr.get(minidx)>arr.get(left))){
                minidx=left;
            }
            if(right<arr.size() && (arr.get(minidx)>arr.get(right))){
                minidx=right;
            }

            if(minidx!=i){
                //swap
                int temp=arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);
                heapify(minidx);
            }
        }

        boolean isEmpty(){

            if(arr.size()==0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {

        Heap hp=new Heap();

        System.out.println(hp.isEmpty());
    
        hp.add(3);
        System.out.println(hp.isEmpty());
        hp.add(4);
        //hp.add(4);
        hp.add(1);
        hp.add(5);

        hp.display();
        System.out.println(hp.peek());
        // while(hp.isEmpty()!=true){
        //     System.out.print(hp.peek()+" ");
        //     hp.Delete();
        // }

        hp.Delete();
        hp.display();
        System.out.println(hp.peek());

        hp.Delete();
        hp.display();
        System.out.println(hp.peek());
    }
}
