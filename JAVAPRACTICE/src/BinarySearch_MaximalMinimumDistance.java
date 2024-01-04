import java.util.*;
public class BinarySearch_MaximalMinimumDistance {

    static boolean isPossible(int[] arr, int min, int child) {   //time complexity = O(n)
        int chplace=1;
        int lastchild=arr[0];
        int i=1;
        while(i<arr.length){
            if(arr[i]-lastchild >= min){
                chplace++;
                lastchild=arr[i];
            }
            i++;
        }

        if(chplace>=child){
            return true;
        }
        else{
            return false;
        }
    }

    static int minans=-1;
    static int MaximalMinimumdistance(int arr[],int st,int en,int child){  //total time complexity=O(nlogN)
        if(arr.length<child){
            return -1;
        }
        int mid=st+(en-st)/2;
        if(st>en){
            return minans;
        }

        if(isPossible(arr,mid,child)==true){
            minans=mid;
            return MaximalMinimumdistance(arr, mid+1, en, child);
        }
        else{
            return MaximalMinimumdistance(arr, st, mid-1, child);
        }
    }
    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Number of starting posts : ");
        int po = scn.nextInt();

        int arr[] = new int[po];
        System.out.println("Location of each spot : ");
        for (int i = 0; i < po; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Number of children to place : ");
        int ch = scn.nextInt();

        System.out.println("Largest Minimum distance possible is : "
                + MaximalMinimumdistance(arr, 0, (int) 1e9, ch));
    }
}
