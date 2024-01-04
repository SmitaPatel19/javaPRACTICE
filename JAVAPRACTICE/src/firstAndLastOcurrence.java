import java.util.*;
public class firstAndLastOcurrence {
    public static int  first=-1;
    public static int last=-1;

    public static void Ocurrence(int arr[],int i,int n){
        if(i==arr.length){
            System.out.println("first ocurrence is = "+first);
            System.out.println("Last ocurrence is = "+last);
            return; 
        }
        if(arr[i]==n){
            if(first==-1){
                first=i;
            }
            else{
                last=i;
            }
        }
        Ocurrence(arr,i+1,n);
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        System.out.print("Enter number to find ocurrence = ");
        int x=scn.nextInt();
        Ocurrence(arr,0,x);
    }

}
