import java.util.*;
public class Recursion_IsSortedArray {

    static boolean IsSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }
        return IsSorted(arr, idx+1);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n = 6;
        System.out.println("Array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(IsSorted(arr,0));
    }    
}
