import java.util.*;
public class TDArray_90Rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("No. of rows : ");
        int n=scn.nextInt();
        int[][] arr=new int[n][n];

        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        System.out.println("Array Entered : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //transpose

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                //swap [i][j] to [j][i]
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        System.out.println("Transposed Array : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //rotate
        for(int i=0;i<n;i++){
            int st=0,en=n-1;
            while(st<en){
                int temp=arr[i][st];
                arr[i][st]=arr[i][en];
                arr[i][en]=temp;
                st++;
                en--;
            }
        }

        System.out.println("Rotated Array : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }    
}
