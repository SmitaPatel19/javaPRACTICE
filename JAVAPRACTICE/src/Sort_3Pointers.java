import java.util.*;
public class Sort_3Pointers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 6;
        int arr[] = new int[n];
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int low=0,mid=0,hi=n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }

        System.out.print("Sorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
