import java.util.*;
public class Stack_Prefix_toPostfix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("String (Prefix) : ");
        String str = scn.nextLine();

        Stack<String> st = new Stack<>();
        
        for(int i=str.length()-1;i>=0;i--){

            char ch=str.charAt(i);
            int ascii=(int) ch;

            if(ch>=48 && ch<=57){
                st.push(ch+"");
            }
            else{
                String x=st.pop();
                String y=st.pop();

                char op=ch;
                String pre=""+x+y+op;

                st.push(pre);
            }
        }

        System.out.println("Postfix : "+st.peek());
    }    
}
