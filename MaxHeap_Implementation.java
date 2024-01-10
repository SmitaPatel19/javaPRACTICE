import java.util.*;

public class MaxHeap_Implementation {
    
    public static class MaxHeap{

        ArrayList<Integer> arr=new ArrayList<>();

        void add(int val){
            arr.add(val);

            int x=arr.size()-1;
            int par=(x-1)/2;

            while(arr.get(x)>arr.get(par)){

                //swap
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }

        }

        void display(){

            System.out.println(arr);
        }

        int peek(){

            if(arr.size()==0){
                System.out.println("Heap is Empty!!!");
                return -1;
            }
            return arr.get(0);
        }

        boolean isEmpty(){
            if(arr.size()==0){
                return true;
            }
            else{
                return false;
            }
        }

        int delete(){
            
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

                //store value
                int data=arr.get(0);

                //swap first and last
                

                int temp=arr.get(0);
                arr.set(0, arr.get(arr.size()-1));
                arr.set(arr.size()-1, temp);

                //remove last
                arr.remove(arr.size()-1);

                heapify(0);
                return data;
            }

        }

        void heapify(int i){

            int left=2*i+1;
            int right = 2*i+2;
            int max=i;

            if (left<arr.size() && (arr.get(left)>arr.get(max))){
                max=left;
            }

            if(right<arr.size() && (arr.get(right)>arr.get(max))){
                max=right;
            }

            if(max != i){

                int temp=arr.get(i);
                arr.set(i, arr.get(max));
                arr.set(max, temp);

                heapify(max);
            }
        }

    }
    public static void main(String[] args) {
        
        MaxHeap hp=new MaxHeap();

        System.out.println(hp.isEmpty());
        hp.add(2);
        System.out.println(hp.isEmpty());
        hp.add(3);
        hp.add(5);
        hp.add(4);

        hp.display();
        System.out.println(hp.peek());

        hp.delete();
        hp.display();
        System.out.println(hp.peek());

        System.out.println(hp.delete());
        hp.display();
    }
}
