import java.util.*;
public class BinarySearch {

    static boolean Search(int arr[],int st,int en,int target){
        if(st>en){
            return false;
        }

        int mid=st+(en-st)/2;
        if(arr[mid]==target){
            return true;
        }
        else if(arr[mid]<target){
            return Search(arr, mid+1, en, target);
        }
        else{
            return Search(arr, st, mid-1, target);
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        int n=6;
        int arr[]=new int[n];
        System.out.println("Array in sorted order : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("Enter number to search : ");
        int x=scn.nextInt();

        System.out.println("Number is present : "+ Search(arr,0,n-1,x));
    }    
}
