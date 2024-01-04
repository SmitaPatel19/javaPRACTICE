import java.util.*;
public class Array_checkQueriesPresent {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 5;
        System.out.println("Array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] freq=new int[100005];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        System.out.print("No. of queries : ");
        int q=scn.nextInt();

        while(q>0){
            int x=scn.nextInt();
            if(freq[x]>0){
                System.out.println("Yes Present");
            }
            else{
                System.out.println("Not Present");
            }
            q--;
        }
    }    
}
