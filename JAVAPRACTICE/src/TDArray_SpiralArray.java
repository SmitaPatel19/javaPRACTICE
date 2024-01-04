import java.util.*;
public class TDArray_SpiralArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number n : ");
        int n=scn.nextInt();

        int[][] arr=new int[n][n];
        
        int rst=0,ren=n-1;
        int cst=0,cen=n-1;
        int count=1;
        while(cst<=cen && rst<=ren){
            for(int i=cst;i<=cen;i++){
                arr[rst][i]=count;
                count++;
            }
            rst++;

            for(int i=rst;i<=ren;i++){
                arr[i][cen]=count;
                count++;
            }
            cen--;

            if(rst<=ren){
                for(int i=cen;i>=cst;i--){
                    arr[ren][i]=count;
                    count++;
                }
                ren--;
            }

            if(cst<=cen){
                for(int i=ren;i>=rst;i--){
                    arr[i][cst]=count;
                    count++;
                }
                cst++;
            }
        }

        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }    
}
