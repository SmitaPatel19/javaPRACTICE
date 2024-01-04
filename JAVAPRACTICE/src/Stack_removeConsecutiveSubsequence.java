import java.util.*;
public class Stack_removeConsecutiveSubsequence {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Size : ");
        int n=scn.nextInt();
        int arr[]=new int[n];

        System.out.println("Array : ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0 || st.peek()!=arr[i]){
                st.push(arr[i]);
            }
            else if( i<n-1 && st.peek()==arr[i] && arr[i]!=arr[i+1]){
                st.pop();
            }
        }

        int res[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

}
