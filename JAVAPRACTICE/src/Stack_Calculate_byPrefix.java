import java.util.Scanner;
import java.util.Stack;

public class Stack_Calculate_byPrefix {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("String : ");
        String str = scn.nextLine();

        Stack<Integer> st = new Stack<>();
        
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int) ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }
            else{
                int y=st.pop();
                int x=st.pop();

                if(ch=='+'){
                    st.push(y+x);
                }
                else if (ch=='-'){
                    st.push(y-x);
                }
                else if(ch=='*'){
                    st.push(y*x);
                }
                else{
                    st.push(y/x);
                }
            }
        }

        System.out.println("Ans : "+st.peek());
    }    
}
