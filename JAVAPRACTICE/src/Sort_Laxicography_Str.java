import java.util.*;
public class Sort_Laxicography_Str {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=6;
        String arr[]=new String[n];

        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextLine();
        }

        //sorting
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min])<0){
                    min=j;
                }
            }
            if(min!=i){   
                String temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }

        System.out.print("Sorted Array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
