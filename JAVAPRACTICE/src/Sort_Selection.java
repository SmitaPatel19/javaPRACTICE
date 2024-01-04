import java.util.*;
public class Sort_Selection {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        
        int n=6;
        int arr[]=new int[n];
        System.out.println("Array : ");

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        //selection sort
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
