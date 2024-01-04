import java.util.*;
public class CheckSorted_recur {

    public static void checkSorted(int arr[],int idx){
        if(idx==arr.length-1){
            System.out.println("Sorted");
            return;
        }

        if(arr[idx]>arr[idx+1]){
            System.out.println("Not Sorted");
            return;
        }
        else{
            checkSorted(arr, idx+1);
        }
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("n : ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        checkSorted(arr,0);
    }    
}
