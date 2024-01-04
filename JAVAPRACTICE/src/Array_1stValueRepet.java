import java.util.*;
public class Array_1stValueRepet {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = 5;
        System.out.println("Array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans=-1;
        int temp=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j] && temp==-1){
                    ans=arr[i];
                    temp=0;
                }
            }
        } 

        System.out.println(ans);
    }    
}
