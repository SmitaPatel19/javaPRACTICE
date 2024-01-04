import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("n : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for(int i=1;i<n;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }

        System.out.println("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
