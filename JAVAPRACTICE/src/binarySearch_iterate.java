import java.util.*;
public class binarySearch_iterate {

    public static void BinarySearch(int arr[],int st,int en,int x){

        int count=0;
        while(st<=en){
            int mid=st+(en-st)/2;
            if(arr[mid]==x){
                count++;
                break;
            }
            else if(arr[mid]>x){
                en=mid-1;
            }
            else if(arr[mid]<x){
                st=mid+1;
            }
        }

        if(count==0){
            System.out.println("Not present");
        }
        else{
            System.out.println("Present.");
        }
    }

    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.print("n : ");
        int n=scn.nextInt();

        int arr[]=new int [n];
        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int st=0;
        int en=n-1;
        System.out.print("x to search : ");
        int x=scn.nextInt();

        BinarySearch(arr,st,en,x);
    }
}