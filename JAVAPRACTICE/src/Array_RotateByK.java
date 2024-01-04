import java.util.*;
public class Array_RotateByK {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 5;
        System.out.println("Array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("k = ");
        int k=scn.nextInt();

        for(int i=0;i<k%n;i++){
            int last=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
