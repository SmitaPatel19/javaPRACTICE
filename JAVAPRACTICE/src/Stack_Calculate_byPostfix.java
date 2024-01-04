import java.util.*;
public class Stack_Calculate_byPostfix {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("String : ");
        String str = scn.nextLine();

        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int) ch;
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }
            else{
                int x=st.pop();
                int y=st.pop();

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
