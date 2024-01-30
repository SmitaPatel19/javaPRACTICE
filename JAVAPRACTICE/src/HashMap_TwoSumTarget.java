import java.util.*;
public class HashMap_TwoSumTarget {
    
    public static void main(String[] args) {
        int sum=29;
        int arr[]={14,7,10,4,5,9,1,2};

        HashMap<Integer , Integer> mp=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(sum-arr[i])){
                mp.put(arr[i], i);
            }
            else{
                System.out.println(i+" "+mp.get(sum-arr[i]));
                return;
            }
        }

        System.out.println("-1");
    }
}
