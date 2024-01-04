import java.util.*;
public class LastOcurr_BinarySearch {

    public static int idx=-1;

    public static void LastOcurr(int arr[],int st,int en,int x){
        if(st>en){
            System.out.println("Last Index is "+idx);
            return;
        }
        int mid=st+(en-st)/2;

        if(arr[mid]==x){
        
            idx=mid;
            
            LastOcurr(arr, mid+1, en, x);
        }
        else if(arr[mid]>x){
            LastOcurr(arr, st, mid-1, x);
        }
        else{
            LastOcurr(arr, mid+1, en, x);
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

        System.out.print("x = ");
        int x=scn.nextInt();
        LastOcurr(arr,0,arr.length - 1,x);
    }
}
