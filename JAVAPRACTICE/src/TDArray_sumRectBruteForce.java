import java.util.*;
public class TDArray_sumRectBruteForce {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Rows : ");
        int r=scn.nextInt();
        System.out.print("Coloumns : ");
        int c=scn.nextInt();

        int arr[][]= new int[r][c];
        System.out.println("Array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        System.out.println("Enter points : ");
        System.out.print("Point 1 : ");
        int l1=scn.nextInt();
        int r1=scn.nextInt();

        System.out.print("Point 2 : ");
        int l2=scn.nextInt();
        int r2=scn.nextInt();

        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum=sum+arr[i][j];
            }
        }

        System.out.println("Sum of rectangle is : "+sum);
        
    }    
}
