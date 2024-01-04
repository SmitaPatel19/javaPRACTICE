import java.util.*;
public class Sort_negPosNum {

    static void Sort(int arr[]){
        int st=0,en=arr.length-1;
        while(st<en){
            while((arr[st]<0)&&st<en){
                st++;
            }
            while((arr[en]>=0) && st<en){
                en--;
            }
            if(st<en){
                int temp=arr[st];
                arr[st]=arr[en];
                arr[en]=temp;
                st++;
                en--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 2;
        int arr[] = new int[n];
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Sort(arr);

        System.out.print("Sorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
