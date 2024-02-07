import java.util.*;
public class Recursion2_checkArraySorted {

    private static boolean CheckSorted(int arr[],int n){
        if(n<=0){
            return true;
        }

        if(arr[n]<arr[n-1]){
            return false;
        }
        return CheckSorted(arr, n - 1);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter size : ");
        int n=scn.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter elements of Array : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Sorted : "+CheckSorted(arr,n-1));
    }
}
