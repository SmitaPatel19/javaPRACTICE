import java.util.*;
public class BinarySearch_LastOcurrence {

    static int l=-1;
    static int LastOcurrence(int arr[],int st,int en,int target){
        if(st>en){
            return -1;
        }
        int mid=st+(en-st)/2;
        if(mid==arr.length-1 || arr[mid]==target && target<arr[mid+1]){
            l=mid;
            return l;
        }
        else if(arr[mid]>target){
            return LastOcurrence(arr, st, mid-1, target);
        }
        else{
            return LastOcurrence(arr, mid+1, en, target);
        }
    }

    public static void main(String[] args) {
        Scanner  scn=new Scanner(System.in);

        int n = 6;
        int arr[] = new int[n];
        System.out.println("Array in sorted order : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter number to find : ");
        int x = scn.nextInt();

        System.out.println("Number is present last at : " + LastOcurrence(arr, 0, n - 1, x));
    }    
}
