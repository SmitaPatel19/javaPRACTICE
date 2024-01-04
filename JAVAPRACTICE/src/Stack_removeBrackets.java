import java.util.*;
public class Stack_removeBrackets {

    static boolean valid(String str){
        int i=0;
        Stack<Character> st=new Stack<>();
        while(i<str.length()){
            char ch=str.charAt(i);

            if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')' && st.isEmpty()==false){
                st.pop();
            }
            else {
                return false;
            }
            i++;
        }

        if(st.isEmpty()==true){
            return true;
        }
        else{
            return false;
        }
    }

    static int BracketsRemove(String str){
        int count=0;
        int i=0;
        Stack<Character> st=new Stack<>();
        while(i<str.length()){
            char ch=str.charAt(i);

            if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')' && st.isEmpty()==false){
                st.pop();
            }
            else {
                count++;
            }
            i++;
        }
        count=count+st.size();
        return count;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        String str=")()())";
        System.out.println(valid(str));
        System.out.println("Minimum number of brackets to make valid string : "+BracketsRemove(str));
    }
}
