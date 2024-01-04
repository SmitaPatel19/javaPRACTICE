import java.util.*;
public class Stack_Postfix_toPrefix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("String (Postfix) : ");
        String str = scn.nextLine();

        Stack<String> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int) ch;
            if(ascii>=48 && ascii<=57){
                st.push(ch+"");
            }
            else{
                String x=st.pop();
                String y=st.pop();

                String pre=""+ch+y+x;
                st.push(pre);
            }

        }

        System.out.println("Prefix : "+st.peek());
    }    
}
