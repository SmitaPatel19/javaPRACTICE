import java.util.*;
public class Array_secondLargest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n = 5;
        System.out.println("Array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }

        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(smax<arr[i]){
                smax=arr[i];
            }
        }

        System.out.println("Second largest : "+smax);
    }    
}
