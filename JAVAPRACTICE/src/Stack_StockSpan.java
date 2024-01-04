import java.util.*;
public class Stack_StockSpan {
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
        res[0]=1;
        
        Stack<Integer> st=new Stack<>();
        res[0]=1;
        st.push(0);

        int i=1;
        while(i<n){
            if(arr[st.peek()]<arr[i]){
                st.pop();
            }
            else if(arr[st.peek()]>arr[i]){
                res[i]=i-st.peek();
                st.push(i);
                i++;
            }

        }

        for(int j=0;j<n;j++){
            System.out.print(res[j]+" ");
        }
    }    
}
