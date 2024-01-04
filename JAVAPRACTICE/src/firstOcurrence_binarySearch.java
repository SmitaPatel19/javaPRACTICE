import java.util.*;
public class firstOcurrence_binarySearch {

    public static void firstOcurr(int arr[],int st,int en,int x){

        if(st>en){
            return;
        }

        int mid=st+(en-st)/2;
        if(arr[mid]==x){
            firstOcurr(arr,st,mid-1,x);
            System.out.println("First Index is = "+mid);
        }
        else if(arr[mid]>x){
            firstOcurr(arr,st,mid-1,x);
        }
        else{
            firstOcurr(arr,mid+1,en,x);
        }


    }
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.print("n : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int st=0;
        int en=n;
        System.out.print("Enter element = ");
        int x=scn.nextInt();

        firstOcurr(arr,st,en,x);
    }
    
}
