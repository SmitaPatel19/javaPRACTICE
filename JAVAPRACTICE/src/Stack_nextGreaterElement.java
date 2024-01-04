import java.util.*;
public class Stack_nextGreaterElement {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Size : ");
        int n = scn.nextInt();
        int arr[] = new int[n];

        System.out.println("Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res[]=new int[n];
        res[n-1]=-1;

        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        int i=n-2;
        while(i>=0){
            if(st.size()==0){
                res[i]=-1;
                st.push(arr[i]);
                i--;
            }
            else if(st.peek()<arr[i]){
                st.pop();
            }
            else{
                res[i]=st.peek();
                st.push(arr[i]);
                i--;
            }
        }

        for(int j=0;j<n;j++){
            System.out.print(res[j]+" ");
        }
    }    
}
