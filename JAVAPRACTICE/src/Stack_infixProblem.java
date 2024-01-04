import java.util.*;
public class Stack_infixProblem {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("String : ");
        String str=scn.nextLine();

        Stack<Integer> st=new Stack<>();
        Stack<Character> op=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int) ch;
            //48=0 , 57=9
            if(ascii>=48 && ascii<=57){
                st.push(ascii-48);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    int x=st.pop();
                    int y=st.pop();
                    
                    if(op.peek()=='+'){
                        st.push(y+x);
                    }
                    else if(op.peek()=='-'){
                        st.push(y-x);
                    }
                    else if(op.peek()=='*'){
                        st.push(y*x);
                    }
                    else if(op.peek()=='/'){
                        st.push(y/x);
                    }
                    op.pop();
                }
                op.pop();
            }
            else{
    
                if(ch=='+' || ch=='-'){
                    int x=st.pop();
                    int y=st.pop();
                    
                    if(op.peek()=='+'){
                        st.push(y+x);
                    }
                    else if(op.peek()=='-'){
                        st.push(y-x);
                    }
                    else if(op.peek()=='*'){
                        st.push(y*x);
                    }
                    else if(op.peek()=='/'){
                        st.push(y/x);
                    }
                    op.pop();

                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        int x=st.pop();
                        int y=st.pop();
                        if(op.peek()=='*'){
                            st.push(y*x);
                        }
                        else{
                            st.push(y/x);
                        }

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
            int x=st.pop();
            int y=st.pop();

            if(op.peek()=='+'){
                st.push(y+x);
            }
            else if(op.peek()=='-'){
                st.push(y-x);
            }
            else if(op.peek()=='*'){
                st.push(y*x);
            }
            else if(op.peek()=='/'){
                st.push(y/x);
            }
            op.pop();
        }

        System.out.println(st.peek());
    }    
}
