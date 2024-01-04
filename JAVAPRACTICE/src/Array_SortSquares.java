import java.util.*;
public class Array_SortSquares {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 5;
        System.out.println("Array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans[]=new int[n];
        int i=0;
        int fr=0,la=n-1;
        while(fr<=la){
            if(Math.abs(arr[fr])> Math.abs(arr[la])){
                ans[i]=arr[fr]*arr[fr];
                i++;
                fr++;
            }
            else {
                ans[i]=arr[la]*arr[la];
                i++;
                la--;
            }
        }

        for(int j=0;j<n/2;j++){
            int temp=ans[j];
            ans[j]=ans[n-1-j];
            ans[n-1-j]=temp;
        }

        for(int j=0;j<n;j++){
            System.out.print(ans[j]+" ");
        }

    }

}
