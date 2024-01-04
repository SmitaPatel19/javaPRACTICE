import java.util.*;
public class BinarySearch_Rotated_targetIndex {

    static int idx=-1;
    static int SearchIdx(int arr[],int st,int en,int target){
        if(st>en){
            return idx;
        }
        int mid=st+(en-st)/2;
        if(arr[mid]==target){
            idx=mid;
            return idx;
        }
        else if(arr[mid]<arr[en]){   //mid to end is sorted
            if(arr[mid]<target && arr[en]<=target){
                return SearchIdx(arr, mid+1, en, target);
            }
            else{
                return SearchIdx(arr, st, mid-1, target);
            }
        }
        else{                      //start to end is sorted
            if(arr[mid]>target && arr[st]<=target){
                return SearchIdx(arr, st, mid-1, target);
            }
            else{
                return SearchIdx(arr, mid+1, en, target);
            }
        }
    }

    static int i=-1;
    static int SearchIdx_Dublicate(int arr[],int st,int en,int target){
        if(st>en){
            return i;
        }
        int mid=st+(en-st)/2;
        if(arr[mid]==target){
            i=mid;
            return i;
        }
        else if(arr[st]==arr[mid] && arr[mid]==arr[en]){
            return SearchIdx_Dublicate(arr, st+1, en-1, target);
        }
        else if(arr[mid]==arr[en]){
            return SearchIdx_Dublicate(arr, st, en-1, target);
        }
        else if(arr[mid]<=arr[en]){   //mid to end is sorted
            if(arr[mid]<target && arr[en]<=target){
                return SearchIdx_Dublicate(arr, mid+1, en, target);
            }
            else{
                return SearchIdx_Dublicate(arr, st, mid-1, target);
            }
        }
        else{                      //start to end is sorted
            if(arr[mid]>target && arr[st]<=target){
                return SearchIdx_Dublicate(arr, st, mid-1, target);
            }
            else{
                return SearchIdx_Dublicate(arr, mid+1, en, target);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);    

        int n = 7;
        int arr[] = new int[n];
        System.out.println("Array in sorted order : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter number to search it's index: ");
        int x = scn.nextInt();

        System.out.println("Number is present at: " + SearchIdx_Dublicate(arr, 0, n - 1, x));

    }
}
