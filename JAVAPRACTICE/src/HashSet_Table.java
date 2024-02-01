import java.util.*;
public class HashSet_Table {
    public static void main(String[] args) {
        
        int arr[] = {2,1,1,3,2,3};
        int maxSize=0;

        HashSet<Integer> set=new HashSet<>(); // table

        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(!set.contains(num)){
                set.add(num);
                maxSize=Math.max(maxSize, set.size());
            }
            else{
                set.remove(num);
            }
        }

        System.out.println("Maximum size: "+maxSize);
    }    
}
