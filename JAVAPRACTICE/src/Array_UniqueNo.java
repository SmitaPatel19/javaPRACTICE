import java.util.*;
public class Array_UniqueNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=5;
        int[] arr=new int[n];
        
        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }

        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        System.out.println("Unique no. is : "+ans);
    }    
}
