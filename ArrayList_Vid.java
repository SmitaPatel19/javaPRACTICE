import java.util.*;
class arrayli{
    int capacity=10;
    int size=0;
    int arr[] = new int[capacity];

    void add(int n){

        if(size>=capacity){
            int newarr[]=new int[2*capacity];
            for(int i=0;i<capacity;i++){
                newarr[i]=arr[i];
            }
            arr=newarr;
        }

        arr[size]=n;
        size++;

    }
    int get(int index){
        return arr[index];
    }
    int size(){
        return size;
    }
    void set(int index,int n){
        arr[index]=n;
        // System.out.print("[");
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+", ");
        // }
        // System.out.println("]");
    }

    void remove(int idx){
        if(idx>=size){
            System.out.println("Out Of Bound Index.");
            return;
        }
        for(int i=idx;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }

    void display(){
        for(int i=0;i<size();i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class ArrayList_Vid {
    public static void main(String[] args){

        try (Scanner scn = new Scanner(System.in)) {
            arrayli arr=new arrayli();

            System.out.println("Enter no. of elements to add : ");
            int ne=scn.nextInt();

            System.out.println("Enter elements to add : ");
            for(int i=0;i<ne;i++){
                int n=scn.nextInt();
                arr.add(n);
            }
   
            System.out.print("ArrayList is : ");
            // for(int i=0;i<arr.size();i++){
            //     System.out.print(arr.get(i)+" ");
            // }

            arr.display();

            System.out.println();

            System.out.println("size : "+arr.size());

            System.out.println("After setting values , Arraylist is : ");
            arr.set(2,5);

            arr.remove(4);
            System.out.println("Arraylist is : ");

            arr.display();
        }
    }
}