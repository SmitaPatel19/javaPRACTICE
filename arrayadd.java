import java.util.*;
public class arrayadd {
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    
        int n;
        System.out.print("Enter size of array = ");
        n= scn.nextInt();

        int arr1[]= new int[n];
        int arr2[]= new int[n];
        int arr3[]= new int[n];

        System.out.println("Enter elements of first array:");
        for(int i=0; i<n; i++)
        {
            System.out.print("arr1["+i+"] = ");
            arr1[i]=scn.nextInt();
        }
        System.out.println();

        System.out.println("Enter elements of second array:");
        for(int i=0;i<n;i++)
        {
            System.out.print("arr2["+i+"] = ");
            arr2[i]=scn.nextInt();
        }
        System.out.println();

        System.out.println("array after sum:");
        for(int i=0;i<n;i++)
        {
            arr3[i]=arr1[i]+arr2[i];
            System.out.println("arr3["+i+"]=" +arr3[i]);
        }
    }
}
