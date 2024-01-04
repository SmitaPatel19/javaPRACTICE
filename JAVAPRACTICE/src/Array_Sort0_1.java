import java.util.*;
public class Array_Sort0_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 5;
        System.out.println("Array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int fr=0;
        int la=n-1;
        while(fr<la){
            if(arr[fr]==1 && arr[la]==0){
                int temp=arr[fr];
                arr[fr]=arr[la];
                arr[la]=temp;
                fr++;
                la--;
            }
            else if(arr[fr]==0){
                fr++;
            }
            else if(arr[la]==1){
                la--;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
