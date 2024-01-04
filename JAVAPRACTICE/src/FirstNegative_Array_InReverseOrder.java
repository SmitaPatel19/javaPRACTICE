import java.util.*;
public class FirstNegative_Array_InReverseOrder {

    public static int[] printNegative(int arr[],int n,int k){

        int res[]=new int [n-k+1];
        int idx=0;
        for(int i=n-k;i>=0;i--){
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    res[idx]=arr[j];
                    break;
                }
                else {
                    res[idx]=0;
                }
            }
            idx++;
        }
        // for(int i=0;i<n-k+1;i++){
        //     System.out.print(res[i]+" ");
        // }
        
        return res;
    }
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("Size : ");
        int n=scn.nextInt();

        int arr[]=new int[n];

        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("No. of elements in pair : ");
        int k=scn.nextInt();

        int re[]=printNegative(arr, n, k);
        for(int i=0;i<re.length;i++){
            System.out.print(re[i]+" ");
        }
    }
}
