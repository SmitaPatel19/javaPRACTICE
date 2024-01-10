import java.util.*;
public class MinHeap_Implementation {

    public static class MinHeap{

        ArrayList<Integer> arr=new ArrayList<>();

        void add(int val){

            arr.add(val);

            int n=arr.size()-1;
            int par=(n-1)/2;

            while(arr.get(n)<arr.get(par)){
                
                int temp=arr.get(n);
                arr.set(n,arr.get(par));
                arr.set(par,temp);

                n=par;
                par=(n-1)/2;
            }
        }

        int peek(){

            return arr.get(0);
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

                int data=arr.get(0);

                int temp=arr.get(arr.size()-1);
                arr.set(arr.size()-1,arr.get(0));
                arr.set(0,temp);

                arr.remove(0);

                heapify(0);
                return data;
            }

        }

        void heapify(int i){

            int left=2*i+1;
            int right=2*i+2;
            int min=i;

            if(left<arr.size() && (arr.get(left)<arr.get(min))){
                min=left;
            }
            if(right<arr.size() && (arr.get(right)<arr.get(min))){
                min=right;
            }

            if(min!=i){

                int temp=arr.get(i);
                arr.set(i,arr.get(min));
                arr.set(min,temp);

                heapify(min);
            }
        }

        void display(){

            System.out.println(arr);
        }


    }
    public static void main(String[] args) {
        
        MinHeap hp=new MinHeap();

        hp.add(5);
        hp.add(3);
        hp.add(4);
        hp.add(1);
        hp.add(2);

        hp.display();
        System.out.println(hp.peek());

        hp.delete();
        hp.display();
        System.out.println(hp.peek());
    }
}
