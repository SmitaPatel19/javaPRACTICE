import java.util.*;
public class Stack_Postfix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("String : ");
        String str = scn.nextLine();

        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0;i<str.length();i++){
            char  ch=str.charAt(i);
            
            String check=""+ch;
            if(ch>=48 && ch<=57){
                st.push(check);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch); 
            }
            else if(ch==')'){
                while(op.peek() != '('){

                    String x=st.pop();
                    String y=st.pop();
                    String pre= "";
                    
                    pre = pre+y;
                    pre = pre+x;

                    if(op.peek()=='+' || op.peek()=='-' || op.peek()=='*' || op.peek()=='/'){
                        pre = pre+op.peek();
                    }

                    st.push(pre);
                    op.pop();

                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    String x=st.pop();
                    String y=st.pop();
                    String pre= "";

                    pre = pre+y;
                    pre = pre+x;
                    if(op.peek()=='+' || op.peek()=='-' || op.peek()=='*' || op.peek()=='/'){
                        pre = pre+op.peek();
                    }
                    
                    st.push(pre);
                    op.pop();
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String pre= "";
                        String x= st.pop();
                        String y=st.pop();

                        pre = pre+y;
                        pre = pre+x;
                        pre = pre+op.peek();
                        
                        st.push(pre);
                        op.pop();
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }

        while(st.size()>1){

            String x=st.pop();
            String y=st.pop();
            String pre= "";
            
            pre = pre+y;
            pre = pre+x;

            if(op.peek()=='+' || op.peek()=='-' || op.peek()=='*' || op.peek()=='/'){
                pre = pre+op.peek();
            }

            st.push(pre);
            op.pop();

        }

        
        System.out.println(st.peek());
        
    }    
}
