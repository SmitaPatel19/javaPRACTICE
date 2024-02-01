import java.util.*;
public class HashSet_LongestConsecutiveSequence {

    //O(n)
    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<>();
        int arr[]={0,3,7,2,5,8,4,6,0,1};

        int maxLength=0;
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }

        for(int num: st){
            if(!st.contains(num-1)){
                int currnum=num;
                int currStreak=1;
                while(st.contains(currnum+1)){
                    currStreak++;
                    currnum++;
                }
                maxLength=Math.max(currStreak, maxLength);
            }
        }

        System.out.println("Maximum length of subsequence : "+maxLength);
    }    
}
