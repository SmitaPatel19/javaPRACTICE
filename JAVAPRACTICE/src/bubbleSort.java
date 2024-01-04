import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("n : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
