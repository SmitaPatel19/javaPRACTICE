import java.util.*;
public class BinarySearch_recur {

    public static void BinarySearch(int arr[],int st,int en,int x){
        if(st>en){
            System.out.println("Not present.");
            return;
        }

        int mid=st+(en-st)/2;
        if(arr[mid]==x){
            System.out.println("Present.");
            return;
        }
        else if(arr[mid]>x){
            BinarySearch(arr, st, mid-1, x);
        }
        else{
            BinarySearch(arr, mid+1, en, x);
        }
        
    }
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.print("n : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int st=0;
        int en=arr.length - 1;

        System.out.print("x to search : ");
        int x = scn.nextInt();

        BinarySearch(arr,st,en,x);
    }    
}
