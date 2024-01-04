import java.util.*;
public class Array_partitionEqualSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 6;
        System.out.println("Array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        int count=0;
        for(int i=0;i<n;i++){
            int prefsum=arr[i];
            int suffsum=arr[n-1]-prefsum;
            if(prefsum==suffsum){
                count++;
            }
        }
        if(count>0){
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }
    }    
}
