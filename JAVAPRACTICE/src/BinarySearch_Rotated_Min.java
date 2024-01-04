import java.util.*;
public class BinarySearch_Rotated_Min {

    static int min=-1;
    static int Min(int arr[],int st,int en){
        if(st>en){
            return min;
        }
        int mid=st+(en-st)/2;
        int last=arr[arr.length-1];
        if(arr[mid]>last){
            return Min(arr,mid+1,en);
        }
        else{
            min=arr[mid];
            return Min(arr,st,mid-1);
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n = 6;
        int arr[] = new int[n];
        System.out.println("Rotated Array in sorted order : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Minimum number is : " + Min(arr, 0, n - 1));
    }    
}
