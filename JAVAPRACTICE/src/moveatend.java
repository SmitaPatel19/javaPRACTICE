import java.util.*;

public class moveatend {
    public static void main(String[] args){

        Scanner scn=new Scanner (System.in);

        System.out.println("Enter no. of elements in array : ");
        int n=scn.nextInt();

        System.out.println("Enter array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int newa[]=new int[n];
        int count=0;
        // int j=0;
        int j = n-1;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                //newa[j]=arr[i];
                count++;
            }
            else{
                //count++;
                newa[j]=arr[i];
                j++;
            }
        }

        for(int i=n-count;i<n;i++){
            newa[i]=0;
        }
        
        System.out.println("New array is :");
        for(int i=0;i<n;i++){
            System.out.println(newa[i]);
        }


    }
}
