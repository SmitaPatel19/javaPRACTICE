import java.util.*;
public class TDArray_SumQueries_PrefixSum {
    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);

        System.out.print("Rows : ");
        int r=scn.nextInt();
        System.out.print("Coloumns : ");
        int c=scn.nextInt();

        int arr[][]=new int[r][c];
        System.out.println("Array : ");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        //prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j] +=arr[i][j-1];
            }
        }

        System.out.print("No. of Queries : ");
        int q=scn.nextInt();

        for(int i=0;i<q;i++){
            System.out.println("Enter points : ");
            System.out.print("Point 1 : ");
            int l1 = scn.nextInt();
            int r1 = scn.nextInt();

            System.out.print("Point 2 : ");
            int l2 = scn.nextInt();
            int r2 = scn.nextInt();

            int sum=0;
            for(int j=l1;j<=l2;j++){
                if(r1>=1){
                    sum=sum+(arr[j][r2]-arr[j][r1-1]);
                }
                else{
                    sum=sum+arr[j][r2];
                }
            }

            System.out.println("Sum : "+sum);
        }
    }    
}
