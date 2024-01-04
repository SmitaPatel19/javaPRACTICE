import java.util.*;
public class Array_checkSorted {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0;i<5;i++){
            arr[i] = scn.nextInt();
        }

        int count=0;

        for(int i=0;i<4;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
        }

        if(count==4){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }    
}
