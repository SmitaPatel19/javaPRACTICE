import java.util.*;
public class Array_SearchElemnt{

    public static void main(String[] args) {
        
        Scanner scn= new Scanner(System.in);
        
        int[] arr = new int[5];
        
        for(int i=0;i<5;i++){
            arr[i]=scn.nextInt();
        }

        int n=5;
        int ind = -1;
        int f=-1;
        for(int i=0;i<5;i++){
            if(n==arr[i] && f==-1 ){
                ind=i;
                f=0;
            }
        }

        System.out.println(ind);
    }
}