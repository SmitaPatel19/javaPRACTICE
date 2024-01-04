import java.util.*;
public class Sort_Array2elem {

    static void Sort(int arr[]){
        if(arr.length==1){
            return;
        }
        int f=-1;
        int s=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                if(f==-1){
                    f=i;
                    s=i+1;
                }
                else{
                    s=i+1;
                }
            }
        }
        if(f!=-1 && s!=-1){   
            int temp=arr[f];
            arr[f]=arr[s];
            arr[s]=temp;
        }
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 2;
        int arr[] = new int[n];
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Sort(arr);

        System.out.print("Sorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
