import java.util.*;

public class Queue_Window_k {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Size : ");
        int n = scn.nextInt();
        int arr[] = new int[n];

        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Window Size, k:");
        int k=scn.nextInt();

        Queue<Integer> qu=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                qu.add(i);
            }
        }

        int[] res=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            int elem=qu.peek();
            if(qu.size()>0 && elem < i){
                qu.remove();
            }
            
            if(qu.size()>0 && elem<=i+k-1){
                res[i]=arr[elem];
            }
            else{
                res[i]=0;

            }
        }

        System.out.print("Result: ");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }    
}
