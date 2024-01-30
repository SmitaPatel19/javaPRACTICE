import java.util.*;
public class HashMap_largestSubArray_0sum {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,-10};

        HashMap<Integer,Integer> mp=new HashMap<>();
        int maxLength=0;
        int prevSum=0;
        mp.put(0, -1);

        for(int i=0;i<arr.length;i++){
            prevSum=arr[i]+prevSum;
            if(!mp.containsKey(prevSum)){
                mp.put(prevSum, i);
            }
            else{
                maxLength=Math.max(maxLength,i-mp.get(prevSum));
            }
        }

        System.out.println("Maximum Subarray Length : "+maxLength);
    }    
}
