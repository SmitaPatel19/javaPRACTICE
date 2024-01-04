import java.util.*;
public class Recursion_searchArray {

    static boolean Search(int arr[],int idx,int x){
        if(idx==arr.length){
            return false;
        }
        if(arr[idx]==x){
            return true;
        }
        return Search(arr, idx+1, x);
    }

    static int SearchInd(int arr[],int idx,int x){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }
        return SearchInd(arr, idx+1, x);
    }

    static int SearchLastInd(int arr[],int n,int x){
        if(n<0){
            return -1;
        }
        if(arr[n]==x){
            return n;
        }
        return SearchLastInd(arr, n-1,x);
    }

    static ArrayList<Integer> SearchAllIndex(int arr[], int idx,int x){
        ArrayList<Integer> ans = new ArrayList<>();

        if(idx==arr.length){
            return ans;
        }
        if(arr[idx]==x){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns=SearchAllIndex(arr, idx+1, x);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        int n = 6;
        System.out.println("Array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("Enter element to search : ");
        int x=scn.nextInt();

        System.out.println("Element is present : " +Search(arr, 0,x));
        System.out.println("Element is present at index : " +SearchInd(arr, 0,x));
        System.out.print("All indices : ");
        ArrayList<Integer> ans = SearchAllIndex(arr, 0, x);

        for(Integer i: ans){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Elements's last index : "+SearchLastInd(arr, n-1, x));
    }    
}
