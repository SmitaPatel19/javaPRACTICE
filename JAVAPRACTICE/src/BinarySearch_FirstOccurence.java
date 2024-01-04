import java.util.*;
public class BinarySearch_FirstOccurence {

    public static int f=-1;
    static int FirstOcurrence(int arr[],int st,int en,int target){
        //int f=-1;
        if(st>en){
            return f;
        }
        int mid=st+(en-st)/2;

        if(mid==0 || target>arr[mid-1] && arr[mid]==target){
            f=mid;
            return f;
        }
        else if(arr[mid]<target){
            return FirstOcurrence(arr, mid+1, en, target);
        }
        else{
            return FirstOcurrence(arr, st, mid-1, target);
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n = 6;
        int arr[] = new int[n];
        System.out.println("Array in sorted order : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter number to Find : ");
        int x = scn.nextInt();

        System.out.println("Number is present at : " + FirstOcurrence(arr, 0, n - 1, x));
    }
}
