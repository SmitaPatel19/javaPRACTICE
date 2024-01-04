import java.util.*;
public class LAB6_HeapArray {

    static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    static void swap(int arr[][],int r1,int r2){
        int temp[]=arr[r1];
        arr[r1]=arr[r2];
        arr[r2]=temp;
    }

    static int[] maxLast(int arr1[],int arr2[]){
        int n1=arr1.length-1;
        int n2=arr2.length-1;
        
        while(n1>=0 && n2>=0){
            
            if(arr1[n1]>arr2[n2]){
                return arr1;
            }
            else if(arr1[n1]<arr2[n2]){
                return arr2;
            }
            else{
                n1--;
                n2--;
            }
        }
        return arr1;
    }
    
    static int[] max(int arr1[],int arr2[]){
        if(sum(arr1)==sum(arr2)){
            if(maxLast(arr1,arr2)==arr1){
                //swap(arr,(i),(i+1));
                return arr2;
            }
            else{// if(minLast(arr1,arr2)==arr2)
                return arr1;
            }
        }
        else if(sum(arr2)<sum(arr1)){
            return arr1;
        }
        else{
            return arr2;
        }
    }
    
    static void heapifymin(int arr[][],int idx,int size){
        int min=idx;
        int left=2*idx+1;
        int right=2*idx+2;

        if(left<size && max(arr[min],arr[left])==arr[min]){

            min=left;
        }
        if(right<size && max(arr[min],arr[right])==arr[min]){

            min=right;
        }

        if(min!=idx){
            swap(arr, min, idx);
            heapifymin(arr, min, size);
        }
    }

    static void BuildMinHeap(int arr[][]){  //Min Heap
        int size=arr.length;
        for(int i=(size/2)-1;i>=0;i--){
            heapifymin(arr, i, size);
        }
    }

    //insert
    static int[][] insert(int arr[][],int narr[]){
        int r=arr.length;
        int c=arr[0].length;

        int newa[][]=new int[r+1][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                newa[i][j]=arr[i][j];
            }
        }

        int idx=0;
        for(int i=0;i<c;i++){
            newa[r][i]=narr[idx++];
        }
        BuildMinHeap(newa);
        display(newa);
    
        return newa;
    }

    // pop 
    static int[][] pop(int arr[][]){
        int n=arr.length;

        //swap
        swap(arr, 0, n-1);
        n--;

        int[][] nArr = new int[n][arr[0].length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                nArr[i][j] = arr[i][j];
            }
        }

        heapifymin(nArr, 0, n);
        display(nArr);
        return nArr;
    }
    
    static void heapifymax(int arr[][],int idx,int size){
        int max=idx;
        int min=idx;
        int left=2*idx+1;
        int right=2*idx+2;

        if(left<size && max(arr[max],arr[left])==arr[left]){
            max=left;
            
        }
        if(right<size && max(arr[max],arr[right])==arr[right]){
            max=right;
            
        }

        if(max!=idx){
            swap(arr, max, idx);
            heapifymax(arr, max, size);
        }
    }


    static void HeapSort(int arr[][]){    // Heap Sort
        int size=arr.length;
        for(int i=(size/2)-1;i>=0;i--){
            heapifymax(arr,i,size);
        }

        for(int i=size-1;i>0;i--){
            swap(arr, 0, i);
            heapifymax(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter number of arrays : ");
        int r=scn.nextInt();
        System.out.print("Enter number of elements in arrays : ");
        int c=scn.nextInt();

        int arr[][]=new int [r][c];

        System.out.println("Enter Arrays: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        //Array
        System.out.println("Array : ");
        display(arr);
        

       //Min Heap
        BuildMinHeap(arr);
        System.out.println("Min Heap : ");
        display(arr);
    
        //pop
        System.out.println("After poping : ");
        arr = pop(arr);
        //sort
        HeapSort(arr);
        System.out.println("After sorting : ");
        display(arr);

        //insert
        System.out.print("Enter array to insert in heap : ");
        int arr1[]=new int[c];
        for(int i=0;i<c;i++){
            arr1[i]=scn.nextInt();
        }
        System.out.println("After Inserting : ");
        arr = insert(arr,arr1);

        //Heap Sort
        HeapSort(arr);
        System.out.println("After sorting : ");
        display(arr);

        //pop
        System.out.println("After poping : ");
        arr = pop(arr);
        //sort
        HeapSort(arr);
        System.out.println("After sorting : ");
        display(arr);
    }    
}
