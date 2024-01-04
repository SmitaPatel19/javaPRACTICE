import java.util.*;
public class TDArray_SumPrefixColRow {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Rows : ");
        int r = scn.nextInt();
        System.out.print("Coloumns : ");
        int c = scn.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Array : ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        // prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        //suffix sum
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                arr[i][j] +=arr[i-1][j];
            }
        }

        System.out.print("No. of Queries : ");
        int q = scn.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.println("Enter points : ");
            System.out.print("Point 1 : ");
            int l1 = scn.nextInt();
            int r1 = scn.nextInt();

            System.out.print("Point 2 : ");
            int l2 = scn.nextInt();
            int r2 = scn.nextInt();

            int sum = 0,tot=0,up=0,left=0,leftup=0;
            
            tot=arr[l2][r2];
            if(l1>=1){
                up=arr[l1-1][r2];
            }
            if(r1>=1){
                left=arr[l2][r1-1];
            }
            if(l1>=1 && r1>=1){
                leftup=arr[l1-1][r1-1];
            }
            sum=(tot-up)-left+leftup;

            System.out.println("Sum : " + sum);
        }
    }    
}
