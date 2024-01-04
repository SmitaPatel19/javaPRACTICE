import java.util.*;
public class Array_maxElemnt {
    
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0;i<5 ;i++){
            arr[i] = scn.nextInt();
        }

        int max=0;
        for(int i=0;i<5;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println(max);
    }
}
