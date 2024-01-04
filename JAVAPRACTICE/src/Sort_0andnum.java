import java.util.*;
public class Sort_0andnum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=6;
        int arr[]=new int[n];

        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        //sort 0 and numbers in relative order
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }

        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
