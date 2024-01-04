import java.util.Scanner;
import java.util.Stack;

public class Stack_Prefix_toInfix {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("String (Prefix) : ");
        String str = scn.nextLine();

        Stack<String> st = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){

            char ch=str.charAt(i);
            int ascii=(int)ch;

            if(ascii>=48 && ascii<=57){
                st.push(ch+"");
            }
            else{
                String x=st.pop();
                String y=st.pop();

                String pre=""+'('+x+ch+y+')';
                st.push(pre);
            }
        }

        System.out.println("Infix : "+st.peek());
    }
}
