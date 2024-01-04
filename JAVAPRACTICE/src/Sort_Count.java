import java.util.*;
public class Sort_Count {

    static  void CountSort(int arr[]){
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int count[]=new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k]=i;
                k++;
            }
        }
    }

    static void CountSort_stableOrd(int arr[]){
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int count[]=new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        //prefix sum
        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }

        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            ans[idx]=arr[i];
            count[arr[i]]--;
        }

        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n = 6;
        int arr[] = new int[n];
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        CountSort_stableOrd(arr);

        System.out.print("Sorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
