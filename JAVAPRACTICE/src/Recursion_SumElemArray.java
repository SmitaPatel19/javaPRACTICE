import java.util.*;
public class Recursion_SumElemArray {

    static int Sum(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        return arr[idx]+Sum(arr, idx+1);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n = 6;
        System.out.println("Array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Sum of Elements : " + Sum(arr, 0));
    }    
}
