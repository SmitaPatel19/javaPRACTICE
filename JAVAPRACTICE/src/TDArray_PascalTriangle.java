import java.util.*;
public class TDArray_PascalTriangle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("No. of rows : ");
        int n=scn.nextInt();

        int arr[][]=new int[n][];

        for(int i=0;i<n;i++){
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }

        System.out.println("Pascal Triangle : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
