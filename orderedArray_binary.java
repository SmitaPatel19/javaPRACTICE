import java.util.*;


public class orderedArray_binary {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter size of array : ");
        int n=scn.nextInt();

        int arr[] = new int[100];
        System.out.println("Enter elements of array(Sorted) : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.print("Enter element to search = ");
        int x = scn.nextInt();

        OrderedArray obj=new OrderedArray();
        //obj.LinearSearch(arr,n, x);
        obj.BinarySearch(arr, 0, (n-1), x);

        System.out.print("Enter number to insert in array which is not present initially : ");
        int num=scn.nextInt();
        obj.Insert(arr,n,num);
        //obj.insert(arr,n+1,4);

    }    
}

class OrderedArray{
    
    public void LinearSearch(int arr[],int size,int x){
        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println("Element is present");
                break;
            }
            else{
                System.out.println("Element is not present");
                break;
            }
        }
    }

    public void BinarySearch(int arr[],int st,int en,int x){
        int cnt=0;
        while(st<=en){
            int mid=st+(en-st)/2;
            if(arr[mid]==x){
                cnt++;
                break;
            }
            else if(arr[mid]<x){
                st=mid+1;
            }
            else if (arr[mid]>x){
                en=mid-1;
            }
        }
        if(cnt==0){
            System.out.println("Not present");
        }
        else{
            System.out.println("Present");
        }
    }

    public void Insert(int arr[],int size,int x){
        int idx=-1;
        for(int i=0;i<size-1;i++){
            if(x>arr[i] && x<arr[i+1]){
                idx=i+1;
            }
        }
        for(int i=size;i>=idx;i--){
            arr[i]=arr[i-1];
        }
        arr[idx]=x;
        System.out.print("[");
        for(int i=0;i<=size;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("]");
    }
}
