import java.util.*;
public class Recursion_FrogJump {

    static int MinCost(int arr[],int idx){

        if(idx==arr.length-1){
            return 0;
        }
        int min1=Math.abs(arr[idx]-arr[idx+1])+MinCost(arr, idx+1);
        if(idx==arr.length-2){
            return min1;
        }
        
        int min2=Math.abs(arr[idx]-arr[idx+2])+MinCost(arr, idx+2);

        if(min1<min2){
            return min1;
        }
        else{
            return min2;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=4;
        int arr[]=new int[n];
        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("Minimum cost : "+MinCost(arr,0));
    }    
}
