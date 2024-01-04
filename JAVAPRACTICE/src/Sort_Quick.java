import java.util.*;
public class Sort_Quick {
    
    static int Partition(int arr[], int st,int en){
        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<=en;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pidx=st+count;
        // putting pivot at it's position
        int t=arr[st];
        arr[st]=arr[pidx];
        arr[pidx]=t;

        //smaller first and larger after pivot
        int idx1=st;
        int idx2=en;
        while(idx1<pidx && idx2>pidx){
            while(arr[idx1]<=pivot){
                idx1++;
            }
            while(arr[idx2]>pivot){
                idx2--;
            }
            if(idx1< pidx && idx2>pidx){
                int temp=arr[idx1];
                arr[idx1]=arr[idx2];
                arr[idx2]=temp;
                idx1++;
                idx2--;
            }
        }
        return pidx;
    }
    
    static void QuickSort(int arr[],int st,int en){

        if(st>=en){
            return;
        }
        int pidx=Partition(arr,st,en);
        QuickSort(arr, st, pidx-1);
        QuickSort(arr, pidx+1, en);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=7;
        int arr[]=new int[n];
        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        QuickSort(arr,0,n-1);

        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }    }    
}
