import java.util.*;
public class TDArray_SpiralPrint {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Rows : ");
        int r=scn.nextInt();
        System.out.print("Column : ");
        int c=scn.nextInt();

        int[][]arr=new int[r][c];
        System.out.println("Array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        System.out.println("Given Array : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int rst=0,ren=r-1;
        int cst=0,cen=c-1;
        
        while(rst<=ren && cst<=cen){
            for(int i=cst;i<=cen;i++){
                System.out.print(arr[rst][i]+" ");
            }
            rst++;
            for(int i=rst;i<=ren;i++){
                System.out.print(arr[i][cen]+" ");
            }
            cen--;

            if(rst<=ren){
                for(int i=cen;i>=cst;i--){
                    System.out.print(arr[ren][i]+" ");
                }
                ren--;
            }
            
            if(cst<=cen){
                for (int i = ren; i >= rst; i--) {
                    System.out.print(arr[i][cst] + " ");
                }
                cst++;
            }
        }
    }    
}
