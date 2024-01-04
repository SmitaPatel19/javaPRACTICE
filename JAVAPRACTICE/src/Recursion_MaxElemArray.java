import java.util.*;
public class Recursion_MaxElemArray {

    static int Max(int arr[],int idx){
        int max=-1;
        if(idx==arr.length-1){
            max=arr[idx];
            return max;
        }
        max= Max(arr,idx+1);
        if(max<arr[idx]){
            max = arr[idx];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=6;
        System.out.println("Array : ");
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Maximum Element : "+Max(arr,0));
    }    
}
