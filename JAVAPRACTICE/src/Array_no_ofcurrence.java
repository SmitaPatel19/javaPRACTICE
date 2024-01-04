import java.util.*;
public class Array_no_ofcurrence {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        int[] arr = new int[5];

        for(int i=0;i<5 ;i++){
            arr[i]=scn.nextInt();
        }

        int ocu=0;
        int n=5;
        for(int i=0;i<5;i++){
            if(arr[i]==n){
                ocu++;
            }
        }

        System.out.println(ocu);
    }    
}
