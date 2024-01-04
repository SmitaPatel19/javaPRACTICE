import java.util.*;
public class Sort_Insertion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 6;
        int arr[] = new int[n];
        System.out.println("Array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        //insertion sort
        for(int i=1;i<n;i++){
            int j=i-1;
            int curr=arr[i];
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        

        System.out.print("Sorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }    
}
