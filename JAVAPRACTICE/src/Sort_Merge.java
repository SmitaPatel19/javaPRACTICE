import java.util.*;
public class Sort_Merge {

    static void Merge(int arr[],int st,int en, int mid){

        int ans[]=new int[en-st+1];
        int idx1=st;
        int idx2=mid+1;
        int i=0;

        while(idx1<=mid && idx2<=en){
            if(arr[idx1]< arr[idx2]){
                ans[i++]=arr[idx1++];
            }
            else{
                ans[i++]=arr[idx2++];
            }
        }

        while(idx1<=mid){
            ans[i++]=arr[idx1++];
        }

        while(idx2<=en){
            ans[i++]=arr[idx2++];
        }

        for(int j=0,k=st;j<ans.length;j++,k++){
            arr[k]=ans[j];
        }
    }

    static void Divide(int arr[],int st,int en){

        int mid=st+(en-st)/2;

        if(st>=en){
            return;
        }

        Divide(arr, st, mid);
        Divide(arr, mid+1, en);
        Merge(arr,st,en,mid);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        int n=6;
        int arr[]=new int[n];
        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        Divide(arr,0,n-1);

        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
