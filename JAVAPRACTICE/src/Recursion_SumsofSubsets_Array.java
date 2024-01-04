import java.util.*;
public class Recursion_SumsofSubsets_Array {

    static void SumsSubsets(int arr[],int idx,int ans){
        if(idx==arr.length){
            System.out.print(ans+" ");
            return ;
        }
        SumsSubsets(arr, idx+1, ans);
        SumsSubsets(arr, idx+1, ans+arr[idx]);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=3;
        int arr[]=new int[n];
        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        SumsSubsets(arr,0,0);
    }    
}
