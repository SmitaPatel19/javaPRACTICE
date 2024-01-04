import java.util.*;
public class BinarySearch_MountainPeakIdx {

    static int idx=-1;

    static int SearchIdx(int arr[],int st,int en){
        int n=arr.length;
        if(st>en){
            return idx;
        }
        int mid=st+(en-st)/2;
        if(arr[0]<arr[n-1]){
            return n-1;
        }
        else if(arr[0]>arr[n-1]){
            return 0;
        }
        else if((mid==0 || arr[mid]>arr[mid-1]) && (mid==n-1 || arr[mid]>arr[mid+1])){
            idx=mid;
        }
        if(arr[mid]< arr[mid+1]){
            // idx=mid+1;
            return SearchIdx(arr, mid+1, en);
        }
        else{
            return SearchIdx(arr, st, mid-1);
        }
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = 7;
        int arr[] = new int[n];
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Peak element is present at: " + SearchIdx(arr, 0, n - 1));
    }    
}
