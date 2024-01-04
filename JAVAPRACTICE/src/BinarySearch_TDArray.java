import java.util.*;
public class BinarySearch_TDArray {

    static boolean Search(int arr[][],int st,int en,int target){
        if(st>en){
            return false;
        }
        int mid=st+(en-st)/2;
        int n=arr[0].length;
        if(arr[mid/n][mid%n]==target){
            return true;
        }
        else if(arr[mid/n][mid%n]<target){
            return Search(arr, mid+1, en, target);
        }
        else{
            return Search(arr, st, mid-1, target);
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Rows : ");
        int r=scn.nextInt();

        System.out.print("Columns : ");
        int c=scn.nextInt();

        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        System.out.print("Enter number to search : ");
        int n= scn.nextInt();

        System.out.print("Number is present : "+ Search(arr,0,r*c-1,n));
    }    
}
