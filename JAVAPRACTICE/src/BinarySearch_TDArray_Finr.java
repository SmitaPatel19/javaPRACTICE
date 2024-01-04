import java.util.*;
public class BinarySearch_TDArray_Finr {

    // rows and columns are sorted
    // sopace complexity =1, time complexity=O(n+m);

    static boolean Search(int arr[][],int target){
       int r=arr.length;
       int c=arr[0].length;
       
       int m=0;
       int n=c-1;
       while(m<r && n>0){
            if(arr[m][n]==target && m<r && n>0){
                return true;
            }
            else if(arr[m][n]>target && n>0){
                n--;
            }
            else if(m<r){
                m++;
            }
       }

       return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Rows : ");
        int r = scn.nextInt();

        System.out.print("Columns : ");
        int c = scn.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter Array : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("Array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter number to search : ");
        int n = scn.nextInt();

        System.out.print("Number is present : " + Search(arr, n));
    }    
}
