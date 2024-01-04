import java.util.*;
public class Array_TargetSum {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int s=6;
        System.out.println("Array : ");
        int[] arr =new int[s];
        for(int i=0;i<s;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("Sum : ");
        int n=scn.nextInt();
        int count=0;
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                if(arr[i]+arr[j]==n){
                    count++;
                }
            }
        }

        System.out.println("Pairs : "+count);
    }    
}
