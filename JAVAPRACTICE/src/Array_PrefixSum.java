import java.util.*;
public class Array_PrefixSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 5;
        System.out.println("Array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nNo. of Queries : ");
        int q=scn.nextInt();

        while(q>0){
            System.out.print("Enter range : start : ");
            int st=scn.nextInt();
            System.out.print("end : ");
            int end=scn.nextInt();

            int sum=arr[end]-arr[st-1];
            System.out.println("Sum : "+sum);

            q--;
        }
    }
}
